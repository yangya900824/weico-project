package com.weico.controller;

import com.weico.utils.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public String test(){
        Test test = new Test();
        return  test.test();
    }

}


