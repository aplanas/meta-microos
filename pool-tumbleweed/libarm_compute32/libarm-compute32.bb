SUMMARY = "ARM Compute Library"
DESCRIPTION = "A software library for computer vision and machine learning. \
The Compute Library is a collection of low-level functions optimized for Arm CPU and GPU architectures targeted at image processing, computer vision, and machine learning. \
Library part."
LICENSE = "MIT"

PV = "23.08"

RPM_NAME = "libarm_compute32-23.08-1.1.aarch64.rpm"
RPM_HASH = "f26f73daa5ef1cb3d41a0996b498aedafa4d1006711f267b1834001e18f3ae07f35be2903f28e19b7db30dc04de6306e8a66d6b785f9b875ddb1435ffd593858"

RPROVIDES:${PN} += "libarm-compute.so.32 \
libarm-compute32"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
