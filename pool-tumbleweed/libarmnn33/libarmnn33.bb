SUMMARY = "libarmnn from armnn"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs. \
 \
This package contains the libarmnn library from armnn."
LICENSE = "MIT"

PV = "23.08"

RPM_NAME = "libarmnn33-23.08-1.1.aarch64.rpm"
RPM_HASH = "cc77a58f49eaca3061703b9061abb60903de1566eda8be6043f1a78a5536986c8c4a3c844d61825a4204f18f862923ac725f789d7c385749f8cfc9e5bdecbb93"

RPROVIDES:${PN} += "libarmnn.so.33 \
libarmnn33"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarm-compute.so.32 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
