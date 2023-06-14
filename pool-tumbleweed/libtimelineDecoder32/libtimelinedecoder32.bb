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

RPM_NAME = "libtimelineDecoder32-23.02-2.1.aarch64.rpm"
RPM_HASH = "a2145e299e12d72c4d128d4e940a6854626f6dc1240899f3ca5bbee55b9c98b51a42a5d1e2b86acc709bd30e67be405dcddb274c9e25b03d9a28bf3310b0b4fa"

RPROVIDES:${PN} += "libtimelineDecoder.so.32 \
libtimelineDecoder32"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
