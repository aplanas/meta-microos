SUMMARY = "Header files of Intel Math Kernel Library"
DESCRIPTION = "Intel Math Kernel Library for Deep Neural Networks (Intel MKL-DNN) is an \
open-source performance library for deep-learning applications. The library \
accelerates deep-learning applications and frameworks on Intel architecture. \
Intel MKL-DNN contains vectorized and threaded building blocks that you can use \
to implement deep neural networks (DNN) with C and C++ interfaces."
LICENSE = "Apache-2.0"

PV = "3.0.1"

RPM_NAME = "libdnnl3-3.0.1-1.2.aarch64.rpm"
RPM_HASH = "c66afe94b921c0ce403ccf5f72ef0310b7ce9ade4418ad93d0cb57ca64373238574eb65175b39e4f33d1dcbc203df5762331115e09907e6e8ae05adef061f20c"

RPROVIDES:${PN} += "libdnnl.so.3()(64bit) \
libdnnl3 \
libdnnl3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgomp.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
