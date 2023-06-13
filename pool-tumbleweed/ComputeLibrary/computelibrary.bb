SUMMARY = "ARM Compute Library"
DESCRIPTION = "A software library for computer vision and machine learning. \
The Compute Library is a collection of low-level functions optimized for Arm CPU and GPU architectures targeted at image processing, computer vision, and machine learning. \
Examples binaries part."
LICENSE = "MIT"

PV = "23.02"

RPM_NAME = "ComputeLibrary-23.02-2.1.aarch64.rpm"
RPM_HASH = "a97fb20bc4da318fce88172ea492ace4ac44ca9ea62f6be3c7a7559d8ab912b8326d19284cf532bd8188f243d89e6ba53bc15b2c61c85315832f1a2b37f51650"

RPROVIDES:${PN} += "ComputeLibrary \
ComputeLibrary(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
libarm_compute.so.30()(64bit) \
libarm_compute_graph.so.30()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
