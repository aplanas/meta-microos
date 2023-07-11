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

RPM_NAME = "libtimelineDecoder32-23.05-1.1.aarch64.rpm"
RPM_HASH = "3fcedb9d4f9a8f4d8c84d61acda11e75c8abf5fc9a1e401e05c856f6e50703ed1c783c5449e5db2cc93c40e75c642d9d70b68dac6808e05524174fc214b753f9"

RPROVIDES:${PN} += "libtimelineDecoder.so.32 \
libtimelineDecoder32"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
