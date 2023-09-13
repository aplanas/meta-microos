SUMMARY = "libarmnnTestUtils from armnn"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs. \
 \
This package contains the libarmnnTestUtils library from armnn."
LICENSE = "MIT"

PV = "23.08"

RPM_NAME = "libarmnnTestUtils3-23.08-1.1.aarch64.rpm"
RPM_HASH = "d8737a5e9b623635061b44b164b8b7bd25dcc2d044656538832b388ecc651ad38c1208ca90a946bb15a1f2eff99d0ffd8d2f24fb7a04d9992a61a298ccbabe9a"

RPROVIDES:${PN} += "libarmnnTestUtils.so.3 \
libarmnnTestUtils3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarmnn.so.33 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
