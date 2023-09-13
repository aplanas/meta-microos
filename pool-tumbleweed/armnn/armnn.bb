SUMMARY = "Arm NN SDK enables machine learning workloads on power-efficient devices"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs."
LICENSE = "MIT"

PV = "23.08"

RPM_NAME = "armnn-23.08-1.1.aarch64.rpm"
RPM_HASH = "4d6639f97b6871561636c8767f76e41ab69d00cbbd6d750ee23c8e3cf10d2e7f66651c6b19e6454e8dd3559c12d499e15438c9a9cb61a4d1314a330aa158af89"

RPROVIDES:${PN} += "armnn"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libarmnn.so.33 \
libarmnn33 \
libarmnnSerializer.so.33 \
libarmnnSerializer33 \
libarmnnTfLiteParser.so.24 \
libarmnnTfLiteParser24 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
