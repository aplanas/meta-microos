SUMMARY = "Arm NN SDK enables machine learning workloads on power-efficient devices"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs."
LICENSE = "MIT"

PV = "23.05"

RPM_NAME = "armnn-23.05-1.1.aarch64.rpm"
RPM_HASH = "bb6732322dcdf72b03a0793a1f8465afabae9d71012b7a383862395c990b5922a0b679cf0c2273c5714fc3de7ddb6407efd5731d4f433cee07ac031cc6ad16da"

RPROVIDES:${PN} += "armnn"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libarmnn.so.32 \
libarmnn32 \
libarmnnSerializer.so.32 \
libarmnnSerializer32 \
libarmnnTfLiteParser.so.24 \
libarmnnTfLiteParser24 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
