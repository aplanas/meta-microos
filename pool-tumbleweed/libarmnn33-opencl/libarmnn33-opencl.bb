SUMMARY = "libarmnn from armnn"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs. \
 \
This package contains the libarmnn library from armnn."
LICENSE = "MIT"

PV = "23.08"

RPM_NAME = "libarmnn33-opencl-23.08-1.1.aarch64.rpm"
RPM_HASH = "ae96dc51277cb38a0b73f3e75a7633249a6cb394f870bc9302e7288213b219982ab6a0f8c919130f1f26ed51d36044b2358a4dd7646e2bd5c5a1fcaa85b32d94"

RPROVIDES:${PN} += "libarmnn.so.33 \
libarmnn33-opencl"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarm-compute.so.32 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
