SUMMARY = "libarmnnSerializer from armnn"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs. \
 \
This package contains the libarmnnSerializer library from armnn."
LICENSE = "MIT"

PV = "23.05"

RPM_NAME = "libarmnnSerializer32-23.05-1.1.aarch64.rpm"
RPM_HASH = "0acde0965c6b3438831037297519ff06427c74c1177fed1e06c45facc22e278137156486bce2be5e47bd934643245cdc49d345e4bec047f269e656f79e50908e"

RPROVIDES:${PN} += "libarmnnSerializer.so.32 \
libarmnnSerializer32"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarmnn.so.32 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
