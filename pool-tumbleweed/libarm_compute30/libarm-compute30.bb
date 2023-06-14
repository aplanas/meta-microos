SUMMARY = "ARM Compute Library"
DESCRIPTION = "A software library for computer vision and machine learning. \
The Compute Library is a collection of low-level functions optimized for Arm CPU and GPU architectures targeted at image processing, computer vision, and machine learning. \
Library part."
LICENSE = "MIT"

PV = "23.02"

RPM_NAME = "libarm_compute30-23.02-2.1.aarch64.rpm"
RPM_HASH = "a46415f142d4621ebf249111d11768276007461fd955539293016a3860074b5c776eb544f6f0a6fe04719719682ead5fcb554a71fb0d3d93baa38184f4243016"

RPROVIDES:${PN} += "libarm-compute.so.30 \
libarm-compute30"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
