SUMMARY = "ARM Compute Library - Graph part"
DESCRIPTION = "A software library for computer vision and machine learning. \
The Compute Library is a collection of low-level functions optimized for Arm CPU and GPU architectures targeted at image processing, computer vision, and machine learning. \
Library part."
LICENSE = "MIT"

PV = "23.02"

RPM_NAME = "libarm_compute_graph30-23.02-2.1.aarch64.rpm"
RPM_HASH = "cde998031c41166ba7ea7bdc46e66557c6a7435cd3a512130064f70d8d137bb55d741127f9052e6f27c28edd10824c844d8cbdabed1746cc3f034b018cfb6284"

RPROVIDES:${PN} += "libarm_compute_graph.so.30()(64bit) \
libarm_compute_graph30 \
libarm_compute_graph30(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libarm_compute.so.30()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
