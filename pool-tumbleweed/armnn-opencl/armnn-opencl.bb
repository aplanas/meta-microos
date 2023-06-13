SUMMARY = "Arm NN SDK enables machine learning workloads on power-efficient devices"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs."
LICENSE = "MIT"

PV = "23.02"

RPM_NAME = "armnn-opencl-23.02-2.1.aarch64.rpm"
RPM_HASH = "997b29fbf15ae5f854aaa33a96e232b6a5f9a119c15a0055cbb5b6cb155a1a497fde93a1ba00ad024fd9ea1935f6a873c1aa0a8159e26e27db72d65afab3335d"

RPROVIDES:${PN} += "armnn-opencl \
armnn-opencl(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libarmnn.so.32()(64bit) \
libarmnn32-opencl \
libarmnnSerializer.so.32()(64bit) \
libarmnnSerializer32-opencl \
libarmnnTfLiteParser.so.24()(64bit) \
libarmnnTfLiteParser24-opencl \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
