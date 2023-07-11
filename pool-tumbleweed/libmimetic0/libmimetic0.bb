SUMMARY = "A C++ MIME library"
DESCRIPTION = "It has been built around the standard library; there are no custom \
string classes or list implementations. Class functionalities and \
behavior is modeled around MIME and the Internet message RFCs. See \
RFC 5322, 2045 and 2046 for terminology, etc. \
2046."
LICENSE = "MIT"

PV = "0.9.8"

RPM_NAME = "libmimetic0-0.9.8-3.9.aarch64.rpm"
RPM_HASH = "dcdedd9fcb2657b29d670c535f5fde68c72b8e12284c8fd4cef2daaa16ad055ecab6eac2078aa046952d6ea52bc0870be8cdf9996937124279707652d3f0ae69"

RPROVIDES:${PN} += "libmimetic.so.0 \
libmimetic0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
