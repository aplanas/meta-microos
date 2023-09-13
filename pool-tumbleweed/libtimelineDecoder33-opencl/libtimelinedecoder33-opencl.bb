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

RPM_NAME = "libtimelineDecoder33-opencl-23.08-1.1.aarch64.rpm"
RPM_HASH = "4979c05de33c99c22898ac87d3b1b049c0283622925d294dd6edb1ce447f147845a49a01051dc5343a3692e446bbc34d453e665011c40faf5233174c201249c4"

RPROVIDES:${PN} += "libtimelineDecoder.so.33 \
libtimelineDecoder33-opencl"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
