SUMMARY = "Arm NN SDK enables machine learning workloads on power-efficient devices"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs."
LICENSE = "MIT"

PV = "23.05"

RPM_NAME = "armnn-opencl-23.05-1.1.aarch64.rpm"
RPM_HASH = "a3bb78eaf8a107467145dc981f37b5dde127dd810050866b6a0a188fc542f72e02f1bef9a30776f247f4a4c2d04e2f51e9b1e28698a24d99ad411a8bb90fcd07"

RPROVIDES:${PN} += "armnn-opencl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libarmnn.so.32 \
libarmnn32-opencl \
libarmnnSerializer.so.32 \
libarmnnSerializer32-opencl \
libarmnnTfLiteParser.so.24 \
libarmnnTfLiteParser24-opencl \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
