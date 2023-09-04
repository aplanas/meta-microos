SUMMARY = "TIFF document support for Xreader"
DESCRIPTION = "A plugin for Xreader to read TIFF documents."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.8.2"

RPM_NAME = "xreader-plugin-tiffdocument-3.8.2-1.1.aarch64.rpm"
RPM_HASH = "59f2d16139495fca23e7b224775fa87b1d7aa173fe39658a2de7d8d990817aaa9971104c17f7a8ab25234a1b39dae1d0ef4b92fd95e200869053cc9f41ff359a"

RPROVIDES:${PN} += "libtiffdocument.so \
xreader-plugin-tiffdocument"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libtiff.so.6 \
libxreaderdocument.so.3 \
xreader"

inherit rpm
