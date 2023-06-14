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

RPM_NAME = "libarmnnTestUtils2-23.02-2.1.aarch64.rpm"
RPM_HASH = "f57ebf19b8d5de0403406dc67fc11cca89025c3cb4371870ade53a7f07d32724cd918057ee7da25705c8ffc341f0b93b859eef47305b501dda97e5b3a1e39743"

RPROVIDES:${PN} += "libarmnnTestUtils.so.2 \
libarmnnTestUtils2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarmnn.so.32 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
