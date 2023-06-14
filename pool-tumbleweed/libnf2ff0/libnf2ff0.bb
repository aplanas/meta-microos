SUMMARY = "Near-field to far-field transformation library"
DESCRIPTION = "Near-field to far-field transformation library."
LICENSE = "GPL-3.0-only"

PV = "0.0.35"

RPM_NAME = "libnf2ff0-0.0.35-5.36.aarch64.rpm"
RPM_HASH = "82e86cd80c53c81f2c2b2b44c952aa41ae1b5ad73713201c767f995edb5efe4b6d60a3b9e1774a132440f6ac791c23b4ca7247b1d24c4c42f2899f5f0d4356ea"

RPROVIDES:${PN} += "libnf2ff.so.0 \
libnf2ff0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libhdf5.so.200 \
libm.so.6 \
libstdc++.so.6 \
libtinyxml.so.0"

inherit rpm
