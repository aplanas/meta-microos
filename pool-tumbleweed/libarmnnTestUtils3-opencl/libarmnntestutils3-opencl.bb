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

RPM_NAME = "libarmnnTestUtils3-opencl-23.08-1.1.aarch64.rpm"
RPM_HASH = "e6c42fc6a274b0d53eb51321c958df9203864c8552d1fa97e9fd673895465fb9bc2d8787dcbc7fa99e7b9088ab9c0336635dcaa3011ab28e65b71d3966c18bcb"

RPROVIDES:${PN} += "libarmnnTestUtils.so.3 \
libarmnnTestUtils3-opencl"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarmnn.so.33 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
