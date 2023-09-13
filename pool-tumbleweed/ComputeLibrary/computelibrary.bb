SUMMARY = "ARM Compute Library"
DESCRIPTION = "A software library for computer vision and machine learning. \
The Compute Library is a collection of low-level functions optimized for Arm CPU and GPU architectures targeted at image processing, computer vision, and machine learning. \
Examples binaries part."
LICENSE = "MIT"

PV = "23.08"

RPM_NAME = "ComputeLibrary-23.08-1.1.aarch64.rpm"
RPM_HASH = "4fa4fc7b48a10f8a5f6cf86d2b64d222f6eae5150c06a255139d9e832e1e96323e60d82e04d5df40b94196d06d0677e272e13fdcf0b2c1be1b99a3e90588fc6e"

RPROVIDES:${PN} += "ComputeLibrary"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libarm-compute-graph.so.32 \
libarm-compute.so.32 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
