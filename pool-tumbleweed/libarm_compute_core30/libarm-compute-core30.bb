SUMMARY = "ARM Compute Library - Core part"
DESCRIPTION = "A software library for computer vision and machine learning. \
The Compute Library is a collection of low-level functions optimized for Arm CPU and GPU architectures targeted at image processing, computer vision, and machine learning. \
Library part."
LICENSE = "MIT"

PV = "23.02"

RPM_NAME = "libarm_compute_core30-23.02-2.1.aarch64.rpm"
RPM_HASH = "428a8491cf557c90c388f0a8d1c3715b3c7b5b2ea0d9166398a2ac64278c64c77ecc56c3d458632dbd16d42b95873d682f47e391b0ce79d22785bce138e68255"

RPROVIDES:${PN} += "libarm_compute_core.so.30()(64bit) \
libarm_compute_core30 \
libarm_compute_core30(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
