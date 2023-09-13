SUMMARY = "libtimelineDecoder from armnn"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs. \
 \
This package contains the libtimelineDecoder library from armnn."
LICENSE = "MIT"

PV = "23.08"

RPM_NAME = "libtimelineDecoder33-23.08-1.1.aarch64.rpm"
RPM_HASH = "8211be7c4e7b165ca8d72b068f931a321e44e2dc9fa835f460b874703dae9c17786f2f68e8ccd45fc5c0dd6565b2bf0ffaedd78f9aae510bb954d63f70b3c45a"

RPROVIDES:${PN} += "libtimelineDecoder.so.33 \
libtimelineDecoder33"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
