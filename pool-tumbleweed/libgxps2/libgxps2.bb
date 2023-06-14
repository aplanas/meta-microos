SUMMARY = "Library for rendering XPS documents"
DESCRIPTION = "libgxps is a GObject based library for handling and rendering XPS \
documents."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.2"

RPM_NAME = "libgxps2-0.3.2-1.11.aarch64.rpm"
RPM_HASH = "7934757f746c5d43d97217d0ef580c2c19cb0076cbf71ffabed26337a853c92ae1a059e686db56d9a2f63353cf42518b2590f7b96b2fb247f62284fe721e9203"

RPROVIDES:${PN} += "libgxps.so.2 \
libgxps2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libcairo.so.2 \
libfreetype.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjpeg.so.8 \
liblcms2.so.2 \
libm.so.6 \
libpng16.so.16 \
libtiff.so.6"

inherit rpm
