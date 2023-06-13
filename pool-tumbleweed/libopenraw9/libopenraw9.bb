SUMMARY = "A library to decode digital camera RAW files"
DESCRIPTION = "libopenraw is a library that aim at decoding digital camera RAW files."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.4"

RPM_NAME = "libopenraw9-0.3.4-2.1.aarch64.rpm"
RPM_HASH = "f17c74323375ff425ac46cc2a4a6a6d07cb5815bc68c9414a13501a8770b4b39a9c64dc1777d3bad79d95e29587530a4a62bce75d99d6017ab65c1294d1b75ff"

RPROVIDES:${PN} += "libopenraw.so.9()(64bit) \
libopenraw9 \
libopenraw9(aarch-64) \
libopenrawgnome.so.9()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libjpeg.so.8()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
