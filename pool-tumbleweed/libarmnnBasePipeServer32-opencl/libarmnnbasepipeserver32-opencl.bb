SUMMARY = "libarmnnBasePipeServer from armnn"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs. \
 \
This package contains the libarmnnBasePipeServer library from armnn."
LICENSE = "MIT"

PV = "23.05"

RPM_NAME = "libarmnnBasePipeServer32-opencl-23.05-1.1.aarch64.rpm"
RPM_HASH = "2648620e640153343a76b9f48d11466b12a6200ff7cb7901045920eadeaf9d2e20c855abc00243945f455eb7ab00d8f751192457f60dd0a9af01176aeda8ee80"

RPROVIDES:${PN} += "libarmnnBasePipeServer.so.32 \
libarmnnBasePipeServer32-opencl"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
