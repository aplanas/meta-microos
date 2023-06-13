SUMMARY = "libarmnnTfLiteParser from armnn"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs. \
 \
This package contains the libarmnnTfLiteParser library from armnn."
LICENSE = "MIT"

PV = "23.02"

RPM_NAME = "libarmnnTfLiteParser24-23.02-2.1.aarch64.rpm"
RPM_HASH = "9e55d194634a077982045d958e4c309c2fd4f4c80721d285996aaed6e118e02cf205235577037b32dc32189e844f19bc02538ee78dc07572e814e23785d1b452"

RPROVIDES:${PN} += "libarmnnTfLiteParser.so.24()(64bit) \
libarmnnTfLiteParser24 \
libarmnnTfLiteParser24(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libarmnn.so.32()(64bit) \
libc.so.6()(64bit) \
libflatbuffers.so.23.3.3()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
