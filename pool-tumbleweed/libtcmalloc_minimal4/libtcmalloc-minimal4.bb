SUMMARY = "Thread-caching malloc library"
DESCRIPTION = "This subpackage contains a library with optimized thread-caching \
malloc()."
LICENSE = "BSD-3-Clause"

PV = "2.10"

RPM_NAME = "libtcmalloc_minimal4-2.10-1.6.aarch64.rpm"
RPM_HASH = "5c9a9cc70733913b0f01bf76a2d173dd3d461e46a707c34e18d8aa36451d881c2825d62b1a0abffb63b81ca9994ce9ced9677d5533779a9f471ecb54d69e0c43"

RPROVIDES:${PN} += "libtcmalloc-minimal.so.4 \
libtcmalloc-minimal4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
