SUMMARY = "libarmnnBasePipeServer from armnn"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs. \
 \
This package contains the libarmnnBasePipeServer library from armnn."
LICENSE = "MIT"

PV = "23.02"

RPM_NAME = "libarmnnBasePipeServer32-opencl-23.02-2.1.aarch64.rpm"
RPM_HASH = "4962f7011061822af492b912df50711325c51ca14ef348fe4ba48847cf0241e8fe8193b81d368b22ffbcad38fa17fb05deb95ed1355d2b867832ef7e633a3a55"

RPROVIDES:${PN} += "libarmnnBasePipeServer.so.32()(64bit) \
libarmnnBasePipeServer32-opencl \
libarmnnBasePipeServer32-opencl(aarch-64)"
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
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
