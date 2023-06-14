SUMMARY = "libarmnn from armnn"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs. \
 \
This package contains the libarmnn library from armnn."
LICENSE = "MIT"

PV = "23.02"

RPM_NAME = "libarmnn32-opencl-23.02-2.1.aarch64.rpm"
RPM_HASH = "b5a7798fc499fb8b40c923ad706bac9518bbc6197ffaa5b1b04a7ce02369c8ec2b981e585d5acae70f67b1541d2fcc8a8ac9c6eb52b5e47407b2f42a1f8a3b83"

RPROVIDES:${PN} += "libarmnn.so.32 \
libarmnn32-opencl"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarm-compute.so.30 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
