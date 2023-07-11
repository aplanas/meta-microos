SUMMARY = "libarmnnTfLiteParser from armnn"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs. \
 \
This package contains the libarmnnTfLiteParser library from armnn."
LICENSE = "MIT"

PV = "23.05"

RPM_NAME = "libarmnnTfLiteParser24-23.05-1.1.aarch64.rpm"
RPM_HASH = "276de64a8848947b39c5cbbda929c038c933dd5f83a2dfa404b4bd81511d9ac712eee01f766dc6647aa2f6d66f305efed99902a938ca61e5d2c106bec1182293"

RPROVIDES:${PN} += "libarmnnTfLiteParser.so.24 \
libarmnnTfLiteParser24"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarmnn.so.32 \
libc.so.6 \
libflatbuffers.so.23.3.3 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
