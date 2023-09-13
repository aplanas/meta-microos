SUMMARY = "libarmnnTfLiteParser from armnn"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs. \
 \
This package contains the libarmnnTfLiteParser library from armnn."
LICENSE = "MIT"

PV = "23.08"

RPM_NAME = "libarmnnTfLiteParser24-opencl-23.08-1.1.aarch64.rpm"
RPM_HASH = "f8682c795513e88cf0c670571427bd844eb971561a9259fb0e33e7b5770db42ff3977f3c6657e675dfedb29c943c7eecdf37a34eb8569914419c64a00d4b81b5"

RPROVIDES:${PN} += "libarmnnTfLiteParser.so.24 \
libarmnnTfLiteParser24-opencl"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarmnn.so.33 \
libc.so.6 \
libflatbuffers.so.23.3.3 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
