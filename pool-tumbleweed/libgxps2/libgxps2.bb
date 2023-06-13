SUMMARY = "Library for rendering XPS documents"
DESCRIPTION = "libgxps is a GObject based library for handling and rendering XPS \
documents."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.2"

RPM_NAME = "libgxps2-0.3.2-1.11.aarch64.rpm"
RPM_HASH = "7934757f746c5d43d97217d0ef580c2c19cb0076cbf71ffabed26337a853c92ae1a059e686db56d9a2f63353cf42518b2590f7b96b2fb247f62284fe721e9203"

RPROVIDES:${PN} += "libgxps.so.2()(64bit) \
libgxps2 \
libgxps2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libarchive.so.13()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libfreetype.so.6()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libjpeg.so.8()(64bit) \
liblcms2.so.2()(64bit) \
libm.so.6()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libtiff.so.6()(64bit)"

inherit rpm
