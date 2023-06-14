SUMMARY = "Arm NN SDK enables machine learning workloads on power-efficient devices"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs."
LICENSE = "MIT"

PV = "23.02"

RPM_NAME = "armnn-23.02-2.1.aarch64.rpm"
RPM_HASH = "e27aeed3c9c90bc63914ae78db7f0d614f71fd8745dc0a1cebf41bbe6ffcf7557876e9f74171d43074925c1a627f41a9582e980ad83d3095dac6515b6f9cdd43"

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
