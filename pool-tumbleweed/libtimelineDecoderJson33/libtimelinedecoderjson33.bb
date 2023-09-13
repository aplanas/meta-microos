SUMMARY = "libtimelineDecoderJson from armnn"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs. \
 \
This package contains the libtimelineDecoder library from armnn."
LICENSE = "MIT"

PV = "23.08"

RPM_NAME = "libtimelineDecoderJson33-23.08-1.1.aarch64.rpm"
RPM_HASH = "4a9e23bef2b2aa7c7e620f15dd5222413df7cf1cf27cd5da487a22ce75d34be861e4189f07852425b060fa07b74e52deeb0e95dba90905e8500221727ae98ead"

RPROVIDES:${PN} += "libtimelineDecoderJson.so.33 \
libtimelineDecoderJson33"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
