SUMMARY = "libarmnn from armnn"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs. \
 \
This package contains the libarmnn library from armnn."
LICENSE = "MIT"

PV = "23.02"

RPM_NAME = "libarmnn32-23.02-2.1.aarch64.rpm"
RPM_HASH = "393b89012a39cca071744a72156fc1107a0809b6bd8345e0d23874d0a537fc39378aab12e4223596a0c6a9254e43c73ce1a905c6742fe7ed6cb28b5091463b98"

RPROVIDES:${PN} += "libarmnn.so.32 \
libarmnn32"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarm-compute.so.30 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
