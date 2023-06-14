SUMMARY = "Fast Library for Approximate Nearest Neighbors"
DESCRIPTION = "FLANN is a library for performing approximate nearest neighbor \
searches in high dimensional spaces. \
 \
This package contains the shared library."
LICENSE = "BSD-3-Clause"

PV = "1.9.2"

RPM_NAME = "libflann1_9-1.9.2-3.3.aarch64.rpm"
RPM_HASH = "ce226cea762414419ec1301cbec6d4ffe6194c27d27c1e0367aa6448cfae85f837bcaf3d57926b47432b3484e0e5a8b9d5a1307542b8937b96b124c750c45da9"

RPROVIDES:${PN} += "libflann-cpp.so.1.9 \
libflann-cpp1-9 \
libflann.so.1.9 \
libflann1-9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
liblz4.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
