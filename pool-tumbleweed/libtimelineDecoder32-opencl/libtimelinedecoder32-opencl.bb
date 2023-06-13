SUMMARY = "libtimelineDecoder from armnn"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs. \
 \
This package contains the libtimelineDecoder library from armnn."
LICENSE = "MIT"

PV = "23.02"

RPM_NAME = "libtimelineDecoder32-opencl-23.02-2.1.aarch64.rpm"
RPM_HASH = "e2705e26b20349cfea5cba9834e6942da69c75f98894d7b7af5a9573f9ff678dea7c40fec9212bc5059176edd634419867bbe58302ce0dc435b6c4ec8652ea42"

RPROVIDES:${PN} += "libtimelineDecoder.so.32()(64bit) \
libtimelineDecoder32-opencl \
libtimelineDecoder32-opencl(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
