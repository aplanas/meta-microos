SUMMARY = "libtimelineDecoderJson from armnn"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs. \
 \
This package contains the libtimelineDecoder library from armnn."
LICENSE = "MIT"

PV = "23.05"

RPM_NAME = "libtimelineDecoderJson32-opencl-23.05-1.1.aarch64.rpm"
RPM_HASH = "d25e200d90861d6c28d77f70447c88126fce90eaeefc779c53ce7b0b75e7ced1995803bb61495973da500608f623179e3f3ef280d4ca7cd24e22c23d43311e03"

RPROVIDES:${PN} += "libtimelineDecoderJson.so.32 \
libtimelineDecoderJson32-opencl"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
