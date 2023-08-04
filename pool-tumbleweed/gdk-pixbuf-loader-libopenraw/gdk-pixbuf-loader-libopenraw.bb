SUMMARY = "gdk-pixbuf loader for libopenraw"
DESCRIPTION = "libopenraw is a library that aim at decoding digital camera RAW files. \
 \
This package provides a libopenraw-based gdk-pixbuf loader."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.7"

RPM_NAME = "gdk-pixbuf-loader-libopenraw-0.3.7-1.1.aarch64.rpm"
RPM_HASH = "e59e1424b061eefb27f339ac5c35d5790def822012f5c59570b8b004b144cf45873a9641366a8ddfdcaba4b2a7a8e0d32cc53b9d7534cb0e06e4fc776e7e5ec8"

RPROVIDES:${PN} += "gdk-pixbuf-loader-libopenraw \
libopenraw-pixbuf.so"

RDEPENDS:${PN} += "/usr/bin/sh \
gdk-pixbuf-query-loaders \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libopenraw.so.9"

inherit rpm
