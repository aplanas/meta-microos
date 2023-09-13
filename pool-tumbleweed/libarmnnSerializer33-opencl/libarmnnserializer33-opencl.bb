SUMMARY = "libarmnnSerializer from armnn"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs. \
 \
This package contains the libarmnnSerializer library from armnn."
LICENSE = "MIT"

PV = "23.08"

RPM_NAME = "libarmnnSerializer33-opencl-23.08-1.1.aarch64.rpm"
RPM_HASH = "29375a3de80f52043cd91937d513d58f658fc32cbf1e8b474a235bebe52373bc094dfb92c94ac8a34a5459bdf76bb2f00e5116e30c3c72fc0712c03b6a229f5a"

RPROVIDES:${PN} += "libarmnnSerializer.so.33 \
libarmnnSerializer33-opencl"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarmnn.so.33 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
