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

RPM_NAME = "libarmnnTestUtils2-opencl-23.05-1.1.aarch64.rpm"
RPM_HASH = "42eb3b9462ea157cacbc7211315fdae9918bfa7ef1072576d5fb602e5a33a5a082072740ba2485bd5ce75e8a89d71952e0fbdaef98719b1e3df5ece5ae1e05e7"

RPROVIDES:${PN} += "libarmnnTestUtils.so.2 \
libarmnnTestUtils2-opencl"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarmnn.so.32 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
