SUMMARY = "ARM Compute Library - Core part"
DESCRIPTION = "A software library for computer vision and machine learning. \
The Compute Library is a collection of low-level functions optimized for Arm CPU and GPU architectures targeted at image processing, computer vision, and machine learning. \
Library part."
LICENSE = "MIT"

PV = "23.05"

RPM_NAME = "libarm_compute_core31-23.05-1.2.aarch64.rpm"
RPM_HASH = "2c0d417db9348f36e1044a5b110bfc229645c32047f4444c27946aff09bef2a3e38c955de11ee9abfe46916038e16f134539a05f967950c8d4bb320c9372b120"

RPROVIDES:${PN} += "libarm-compute-core.so.31 \
libarm-compute-core31"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
