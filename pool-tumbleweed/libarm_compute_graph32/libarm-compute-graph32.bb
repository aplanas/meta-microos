SUMMARY = "ARM Compute Library - Graph part"
DESCRIPTION = "A software library for computer vision and machine learning. \
The Compute Library is a collection of low-level functions optimized for Arm CPU and GPU architectures targeted at image processing, computer vision, and machine learning. \
Library part."
LICENSE = "MIT"

PV = "23.08"

RPM_NAME = "libarm_compute_graph32-23.08-1.1.aarch64.rpm"
RPM_HASH = "dc7891b9a36b8996ae6b3275cfd2ed71d226bbf6e14d23d0628d959aa169be19585c866217a02d7fb9c117aacec8a1c000de4dc0d5bbeb6661b5823ab01f528e"

RPROVIDES:${PN} += "libarm-compute-graph.so.32 \
libarm-compute-graph32"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarm-compute.so.32 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
