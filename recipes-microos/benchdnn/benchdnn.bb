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

RPROVIDES:${PN} += "benchdnn benchdnn(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdnnl.so.3()(64bit) libdnnl3 libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgomp.so.1()(64bit) libgomp.so.1(GOMP_4.0)(64bit) libgomp.so.1(OMP_1.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
