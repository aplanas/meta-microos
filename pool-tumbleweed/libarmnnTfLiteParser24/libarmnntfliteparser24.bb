SUMMARY = "libarmnnTfLiteParser from armnn"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs. \
 \
This package contains the libarmnnTfLiteParser library from armnn."
LICENSE = "MIT"

PV = "23.08"

RPM_NAME = "libarmnnTfLiteParser24-23.08-1.1.aarch64.rpm"
RPM_HASH = "97dd0921a0f0f77bf5eb9bab0f20b930b2a39df7f97f93b8ef9fff0a5d3d71e6b3ba7753b2fc8ecb870715ff959db91d6e55b9d9b04c90efbb17064ef0843409"

RPROVIDES:${PN} += "libarmnnTfLiteParser.so.24 \
libarmnnTfLiteParser24"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarmnn.so.33 \
libc.so.6 \
libflatbuffers.so.23.3.3 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
