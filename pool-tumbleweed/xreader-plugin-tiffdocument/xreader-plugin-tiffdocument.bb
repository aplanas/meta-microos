SUMMARY = "TIFF document support for Xreader"
DESCRIPTION = "A plugin for Xreader to read TIFF documents."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.4.5"

RPM_NAME = "xreader-plugin-tiffdocument-3.4.5-1.5.aarch64.rpm"
RPM_HASH = "53473b6f005b41bf5a0331a2ef7a4c5213f30db5316fc6c3c8f02cdee098d08ca78b82a80611f7a7582a15f85ec243fd4505c7e6eeafee730121ac77c3549f8a"

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
