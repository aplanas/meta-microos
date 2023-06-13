SUMMARY = "libarmnnTestUtils from armnn"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs. \
 \
This package contains the libarmnnTestUtils library from armnn."
LICENSE = "MIT"

PV = "23.02"

RPM_NAME = "libarmnnTestUtils2-opencl-23.02-2.1.aarch64.rpm"
RPM_HASH = "1001efbeccbb2d1cc9e133b957f4d366a660e0ad78a8b7bfbba6b3312a4c37254c79779a1f8c10bd75ec47eb90230b7c7d1a7b53d51a0b24f1a25491f6ae89da"

RPROVIDES:${PN} += "libarmnnTestUtils.so.2()(64bit) \
libarmnnTestUtils2-opencl \
libarmnnTestUtils2-opencl(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libarmnn.so.32()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
