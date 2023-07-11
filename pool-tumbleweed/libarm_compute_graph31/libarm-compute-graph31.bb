SUMMARY = "ARM Compute Library - Graph part"
DESCRIPTION = "A software library for computer vision and machine learning. \
The Compute Library is a collection of low-level functions optimized for Arm CPU and GPU architectures targeted at image processing, computer vision, and machine learning. \
Library part."
LICENSE = "MIT"

PV = "23.05"

RPM_NAME = "libarm_compute_graph31-23.05-1.2.aarch64.rpm"
RPM_HASH = "01615599c5cd7ded54fad5a6df68febe52e2e2e06122f86ec857e7b08a4ab866dff5e62276cd971207641dfd65f0b78801d4c88d6c92639b058a12e3b6ffd635"

RPROVIDES:${PN} += "libarm-compute-graph.so.31 \
libarm-compute-graph31"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarm-compute.so.31 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
