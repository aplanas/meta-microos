SUMMARY = "libarmnnSerializer from armnn"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs. \
 \
This package contains the libarmnnSerializer library from armnn."
LICENSE = "MIT"

PV = "23.02"

RPM_NAME = "libarmnnSerializer32-23.02-2.1.aarch64.rpm"
RPM_HASH = "c972e5bd12eeaa9a6457522dd1d8cbf70c8eb59dfffc121e3059c68e59bcb507d22fb9652524dff55951d54b3da80ee0507d736db3d43c27bae1551e3d654173"

RPROVIDES:${PN} += "libarmnnSerializer.so.32 \
libarmnnSerializer32"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarmnn.so.32 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
