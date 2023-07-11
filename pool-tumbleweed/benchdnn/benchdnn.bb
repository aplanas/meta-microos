SUMMARY = "Header files of Intel Math Kernel Library"
DESCRIPTION = "Intel Math Kernel Library for Deep Neural Networks (Intel MKL-DNN) is an \
open-source performance library for deep-learning applications. The library \
accelerates deep-learning applications and frameworks on Intel architecture. \
Intel MKL-DNN contains vectorized and threaded building blocks that you can use \
to implement deep neural networks (DNN) with C and C++ interfaces. \
 \
This package only includes the benchmark utility including its input files."
LICENSE = "Apache-2.0"

PV = "3.0.1"

RPM_NAME = "benchdnn-3.0.1-1.3.aarch64.rpm"
RPM_HASH = "b9cd013d3a5a5321ac9104d3aeec007cf179a718b74f1eb31edf6759420d05fca57462fcc3e7ebda0d5d24c474daad428600624da80ae94af45c2264c04d47b6"

RPROVIDES:${PN} += "benchdnn"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdnnl.so.3 \
libdnnl3 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
