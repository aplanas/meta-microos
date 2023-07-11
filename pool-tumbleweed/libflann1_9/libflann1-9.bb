SUMMARY = "Fast Library for Approximate Nearest Neighbors"
DESCRIPTION = "FLANN is a library for performing approximate nearest neighbor \
searches in high dimensional spaces. \
 \
This package contains the shared library."
LICENSE = "BSD-3-Clause"

PV = "1.9.2"

RPM_NAME = "libflann1_9-1.9.2-3.4.aarch64.rpm"
RPM_HASH = "53d2a4150b5dfe7213b8538d5f6e38c4662525beb2bb9aa065a3e189e7b2326e98507ca5bfbd9d536a10c46950f95d5b592a69f71e38d8cec7137d4f64137225"

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
