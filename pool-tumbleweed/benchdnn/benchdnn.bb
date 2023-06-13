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

RPM_NAME = "benchdnn-3.0.1-1.2.aarch64.rpm"
RPM_HASH = "e35ee24aa9f41ad186ce6f7f64f4af10ce03aa5b80f06b542dd06c1c93ce75eba6b2b6603d0a7ad70937b616c5bcccf547e1165d63932d2855cb6040e480c586"

RPROVIDES:${PN} += "benchdnn \
benchdnn(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdnnl.so.3()(64bit) \
libdnnl3 \
libgcc_s.so.1()(64bit) \
libgomp.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
