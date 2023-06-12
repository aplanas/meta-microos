SUMMARY = "libtimelineDecoderJson from armnn"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs. \
 \
This package contains the libtimelineDecoder library from armnn."
LICENSE = "MIT"

PV = "23.02"

RPM_NAME = "libtimelineDecoderJson32-opencl-23.02-2.1.aarch64.rpm"
RPM_HASH = "b97b5ffa88f35bd66daf9d81883e444297f7d2e39273fa5496ceb63b47a2287873a275045ee463dea255307acb2519da320a424f4fb7ab088290a12f4fcd6317"

RPROVIDES:${PN} += "libtimelineDecoderJson.so.32()(64bit) \
libtimelineDecoderJson32-opencl \
libtimelineDecoderJson32-opencl(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
