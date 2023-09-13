SUMMARY = "Arm NN SDK enables machine learning workloads on power-efficient devices"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs."
LICENSE = "MIT"

PV = "23.08"

RPM_NAME = "armnn-opencl-23.08-1.1.aarch64.rpm"
RPM_HASH = "def1421ec0cecd5e1270cb1f171df4d4835c95e07b86a82fe2f3228f307b95b693004cb1399aba6cf15cd988854ecc3977812b6d75e79851e3f6bfa9fac993f2"

RPROVIDES:${PN} += "armnn-opencl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libarmnn.so.33 \
libarmnn33-opencl \
libarmnnSerializer.so.33 \
libarmnnSerializer33-opencl \
libarmnnTfLiteParser.so.24 \
libarmnnTfLiteParser24-opencl \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
