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

RPM_NAME = "libtimelineDecoderJson33-opencl-23.08-1.1.aarch64.rpm"
RPM_HASH = "7e2b682b9ecec4dce31312c46dcbcfa284328f54ebfa41828bce105f9bf8b8b771d80c3ec9a15dbb7177d6706a738152f84079c7f0e2dfd39548c621f2439a0d"

RPROVIDES:${PN} += "libtimelineDecoderJson.so.33 \
libtimelineDecoderJson33-opencl"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
