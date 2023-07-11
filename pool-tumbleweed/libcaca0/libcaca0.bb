SUMMARY = "Library for Colour ASCII Art, text mode graphics"
DESCRIPTION = "libcaca is the Colour AsCii Art library. It provides high level \
functions for colour text drawing, simple primitives for line, polygon \
and ellipse drawing, as well as powerful image to text conversion \
routines."
LICENSE = "WTFPL"

PV = "0.99.beta20"

RPM_NAME = "libcaca0-0.99.beta20-1.5.aarch64.rpm"
RPM_HASH = "c4f9eb3280f2b9b909c5a01bca88e3612441037e0ee92cc4c1f6d4db43deed1497bec33853734e048e2bed52c63dfef94aedcaf7d9f0638889b988b07d794fed"

RPROVIDES:${PN} += "libcaca \
libcaca++.so.0 \
libcaca.so.0 \
libcaca0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libslang.so.2 \
libstdc++.so.6 \
libtinfo.so.6 \
libz.so.1"

inherit rpm
