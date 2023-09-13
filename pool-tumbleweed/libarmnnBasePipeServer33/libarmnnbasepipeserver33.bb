SUMMARY = "libarmnnBasePipeServer from armnn"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs. \
 \
This package contains the libarmnnBasePipeServer library from armnn."
LICENSE = "MIT"

PV = "23.08"

RPM_NAME = "libarmnnBasePipeServer33-23.08-1.1.aarch64.rpm"
RPM_HASH = "24178619a79caa8ce6e046828eee2fd4d95e49064634c57c6b4b9d8df7297aec55b31b11e9ed43fe3bdd1a9f2bdf8ebddfa04de2b0b8eb511a62c8e0137fef60"

RPROVIDES:${PN} += "libarmnnBasePipeServer.so.33 \
libarmnnBasePipeServer33"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
