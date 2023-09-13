SUMMARY = "libarmnnBasePipeServer from armnn"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs. \
 \
This package contains the libarmnnBasePipeServer library from armnn."
LICENSE = "MIT"

PV = "23.08"

RPM_NAME = "libarmnnBasePipeServer33-opencl-23.08-1.1.aarch64.rpm"
RPM_HASH = "a06664fe8aa5ec4f39618a91a9cdac5cb016c4749742aff394467e67a4ef72db0dc7a0a02d913e412d6c1631bb93ef37e6954949d44826f7f64c879937180e72"

RPROVIDES:${PN} += "libarmnnBasePipeServer.so.33 \
libarmnnBasePipeServer33-opencl"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
