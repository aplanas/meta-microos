SUMMARY = "libarmnnSerializer from armnn"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs. \
 \
This package contains the libarmnnSerializer library from armnn."
LICENSE = "MIT"

PV = "23.08"

RPM_NAME = "libarmnnSerializer33-23.08-1.1.aarch64.rpm"
RPM_HASH = "595e0e9e7362a3e511c264384e4a76ddfe74532a4bb17cf74a8536cd278d136f5c9e2a1cc5460c1527a5a6d8ea22dddd515d3176e54c75aefe997c07a097e3e5"

RPROVIDES:${PN} += "libarmnnSerializer.so.33 \
libarmnnSerializer33"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarmnn.so.33 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
