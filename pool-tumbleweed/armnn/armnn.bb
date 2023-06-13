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

RPROVIDES:${PN} += "armnn \
armnn(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libarmnn.so.32()(64bit) \
libarmnn32 \
libarmnnSerializer.so.32()(64bit) \
libarmnnSerializer32 \
libarmnnTfLiteParser.so.24()(64bit) \
libarmnnTfLiteParser24 \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
