SUMMARY = "A library to decode digital camera RAW files"
DESCRIPTION = "libopenraw is a library that aim at decoding digital camera RAW files."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.4"

RPM_NAME = "libopenraw9-0.3.4-2.1.aarch64.rpm"
RPM_HASH = "f17c74323375ff425ac46cc2a4a6a6d07cb5815bc68c9414a13501a8770b4b39a9c64dc1777d3bad79d95e29587530a4a62bce75d99d6017ab65c1294d1b75ff"

RPROVIDES:${PN} += "libopenraw.so.9 \
libopenraw9 \
libopenrawgnome.so.9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjpeg.so.8 \
libstdc++.so.6"

inherit rpm
