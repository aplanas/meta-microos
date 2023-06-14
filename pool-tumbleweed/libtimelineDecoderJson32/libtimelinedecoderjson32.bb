SUMMARY = "libtimelineDecoderJson from armnn"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs. \
 \
This package contains the libtimelineDecoder library from armnn."
LICENSE = "MIT"

PV = "23.02"

RPM_NAME = "libtimelineDecoderJson32-23.02-2.1.aarch64.rpm"
RPM_HASH = "9145ee8815f7d2c89ea01b49716dd4522bc1c1580a3948139c850d5d6919e88e5129a6adbbe2bb3c43610f55b56f07ccf88c22f02efa108a54f354a993ff41ec"

RPROVIDES:${PN} += "libtimelineDecoderJson.so.32 \
libtimelineDecoderJson32"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
