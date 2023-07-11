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

RPM_NAME = "libtimelineDecoderJson32-23.05-1.1.aarch64.rpm"
RPM_HASH = "2bacb28e482516c908f154d0c9a228b68cf672f6ba5be238e50ce99f99efd915fe2d48fbc19a878c996b128c8446ca5db9846349775899e3a4a7af9b124a7361"

RPROVIDES:${PN} += "libtimelineDecoderJson.so.32 \
libtimelineDecoderJson32"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
