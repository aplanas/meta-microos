SUMMARY = "Header files of Intel Math Kernel Library"
DESCRIPTION = "Intel Math Kernel Library for Deep Neural Networks (Intel MKL-DNN) is an \
open-source performance library for deep-learning applications. The library \
accelerates deep-learning applications and frameworks on Intel architecture. \
Intel MKL-DNN contains vectorized and threaded building blocks that you can use \
to implement deep neural networks (DNN) with C and C++ interfaces."
LICENSE = "Apache-2.0"

PV = "3.0.1"

RPM_NAME = "libdnnl3-3.0.1-1.3.aarch64.rpm"
RPM_HASH = "a06775825505b1bf6207e76eb4a16da682740272c1ce0137126a99dfa963080cf718b3eb05bc7c22e6460b6932e08b9972f9bb92591716b8909cc9bf6963134c"

RPROVIDES:${PN} += "libdnnl.so.3 \
libdnnl3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
