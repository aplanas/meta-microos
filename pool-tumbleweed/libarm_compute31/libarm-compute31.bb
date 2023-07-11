SUMMARY = "ARM Compute Library"
DESCRIPTION = "A software library for computer vision and machine learning. \
The Compute Library is a collection of low-level functions optimized for Arm CPU and GPU architectures targeted at image processing, computer vision, and machine learning. \
Library part."
LICENSE = "MIT"

PV = "23.05"

RPM_NAME = "libarm_compute31-23.05-1.2.aarch64.rpm"
RPM_HASH = "7adee826fa9a67251d58915bcd381c8e6ac6af6dacf276e1e85835990be8e8b6f5e86362b1f7602b4746957d6966ec0fa485fa67bcb0db20bdd80a0fc039e1fc"

RPROVIDES:${PN} += "libarm-compute.so.31 \
libarm-compute31"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
