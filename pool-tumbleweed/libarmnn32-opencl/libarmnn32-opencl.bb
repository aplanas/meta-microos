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

RPM_NAME = "libarmnn32-opencl-23.05-1.1.aarch64.rpm"
RPM_HASH = "cade041350416dc7b89da91914895fe928024a4b278dfe79de7cce73a6c3930b9ceeea42ce6cc50acd435ef5c5d5ed7e8a3a3cd5287174e2742c57222c528cc3"

RPROVIDES:${PN} += "libarmnn.so.32 \
libarmnn32-opencl"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarm-compute.so.31 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
