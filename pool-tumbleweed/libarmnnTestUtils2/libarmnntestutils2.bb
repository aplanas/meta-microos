SUMMARY = "libarmnnTestUtils from armnn"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs. \
 \
This package contains the libarmnnTestUtils library from armnn."
LICENSE = "MIT"

PV = "23.05"

RPM_NAME = "libarmnnTestUtils2-23.05-1.1.aarch64.rpm"
RPM_HASH = "d8a7289310c7dcead7ea05b9fe0d607c0dba060ead4fa1ded227a2a79baaac5f701367950d388fb55b1e589b253391e218ba07d38ee1b33b63d9b9c85f8cddcb"

RPROVIDES:${PN} += "libarmnnTestUtils.so.2 \
libarmnnTestUtils2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarmnn.so.32 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
