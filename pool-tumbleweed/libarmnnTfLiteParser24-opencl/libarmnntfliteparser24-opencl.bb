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

RPM_NAME = "libarmnnTfLiteParser24-opencl-23.02-2.1.aarch64.rpm"
RPM_HASH = "fc78b4e5f2fc6921bbea8bf25af3d1f27b518e3119df41929c93ab32356d6114a9423093ebf2eaf5f7ddca284575ace23d86b5bbc67cb243e7baabfbd8e0aa35"

RPROVIDES:${PN} += "libarmnnTfLiteParser.so.24()(64bit) \
libarmnnTfLiteParser24-opencl \
libarmnnTfLiteParser24-opencl(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libarmnn.so.32()(64bit) \
libc.so.6()(64bit) \
libflatbuffers.so.23.3.3()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
