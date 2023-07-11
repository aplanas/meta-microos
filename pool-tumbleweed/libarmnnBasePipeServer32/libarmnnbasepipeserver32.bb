SUMMARY = "libarmnnBasePipeServer from armnn"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs. \
 \
This package contains the libarmnnBasePipeServer library from armnn."
LICENSE = "MIT"

PV = "23.05"

RPM_NAME = "libarmnnBasePipeServer32-23.05-1.1.aarch64.rpm"
RPM_HASH = "a34d99f6ae5903e6dd5d192f8659a9a1de78610bf960891a6bb624b22aa63920ff780fdbf68d57f3608c5859975e4b5e05721c00eae6061a9f2538e80a98b282"

RPROVIDES:${PN} += "libarmnnBasePipeServer.so.32 \
libarmnnBasePipeServer32"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
