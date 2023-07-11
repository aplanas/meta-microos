SUMMARY = "libarmnn from armnn"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs. \
 \
This package contains the libarmnn library from armnn."
LICENSE = "MIT"

PV = "23.05"

RPM_NAME = "libarmnn32-23.05-1.1.aarch64.rpm"
RPM_HASH = "af64568771ce93c4b0898519bf9504c6b348c83ddbfdf6b9d60d746ae78ab1d0fac17ceb01af8cc8d62d59ce0c321bd8699cc25f5b05b23bc3d929ae72b502e7"

RPROVIDES:${PN} += "libarmnn.so.32 \
libarmnn32"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarm-compute.so.31 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
