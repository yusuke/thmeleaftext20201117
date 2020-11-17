package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Web {
    @RequestMapping("/")
    public String test(Model model){
        model.addAttribute("hello", "world");
        return "index";
    }
}
