SUMMARY = "libtimelineDecoder from armnn"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs. \
 \
This package contains the libtimelineDecoder library from armnn."
LICENSE = "MIT"

PV = "23.05"

RPM_NAME = "libtimelineDecoder32-opencl-23.05-1.1.aarch64.rpm"
RPM_HASH = "8f6db86b305461b870b427b21a535223df85d8d8cfee22d76d948d59c15b84ebac4a1fac2d498f80303d121a2eaf10fec47cbf07cd601068b6a34d87839ff824"

RPROVIDES:${PN} += "libtimelineDecoder.so.32 \
libtimelineDecoder32-opencl"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
