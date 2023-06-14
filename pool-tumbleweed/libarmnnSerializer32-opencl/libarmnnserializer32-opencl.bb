SUMMARY = "libarmnnSerializer from armnn"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs. \
 \
This package contains the libarmnnSerializer library from armnn."
LICENSE = "MIT"

PV = "23.02"

RPM_NAME = "libarmnnSerializer32-opencl-23.02-2.1.aarch64.rpm"
RPM_HASH = "329fef5ecf0fbae6f19c3291077d59f2878ff5108eaf8452e24eca055cb605bd065e269d3f3df191539c4dc436216a80570b6b5003b6a4ebf8718ac837e7512e"

RPROVIDES:${PN} += "libarmnnSerializer.so.32 \
libarmnnSerializer32-opencl"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarmnn.so.32 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
