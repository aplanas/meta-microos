SUMMARY = "libarmnnSerializer from armnn"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs. \
 \
This package contains the libarmnnSerializer library from armnn."
LICENSE = "MIT"

PV = "23.05"

RPM_NAME = "libarmnnSerializer32-opencl-23.05-1.1.aarch64.rpm"
RPM_HASH = "c1a1c549a785465604f6a585abedc5c49aa680ee929054689faeb4a9cde87b436021d2115f1a86b8352087292635d3d0168dff617779b2561f73cd11968f2036"

RPROVIDES:${PN} += "libarmnnSerializer.so.32 \
libarmnnSerializer32-opencl"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarmnn.so.32 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
