SUMMARY = "ARM Compute Library - Core part"
DESCRIPTION = "A software library for computer vision and machine learning. \
The Compute Library is a collection of low-level functions optimized for Arm CPU and GPU architectures targeted at image processing, computer vision, and machine learning. \
Library part."
LICENSE = "MIT"

PV = "23.08"

RPM_NAME = "libarm_compute_core32-23.08-1.1.aarch64.rpm"
RPM_HASH = "000c3e61fd480bb39d5df7f6012afede78cc5e6cfb2d18dff5083323ea028ad540ee14f22ced0c97196c49b1a523908e7ccc8764dcd9ab153ede9dbf6ffb9ec3"

RPROVIDES:${PN} += "libarm-compute-core.so.32 \
libarm-compute-core32"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
