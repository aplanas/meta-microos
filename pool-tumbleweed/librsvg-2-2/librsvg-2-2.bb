SUMMARY = "A Library for Rendering SVG Data"
DESCRIPTION = "This package contains a library to render SVG (scalable vector \
graphics) data. This format has been specified by the W3C (see \
http://www.w3c.org)."
LICENSE = "Apache-2.0 & LGPL-2.0-or-later & MIT"

PV = "2.56.1"

RPM_NAME = "librsvg-2-2-2.56.1-1.1.aarch64.rpm"
RPM_HASH = "ed52f3f3e316da25ca523040cc7ee7a68facb88c22956890e15394ffff12ed5471fa32ea35a6d3894f97380c611ac2fdef13c3efc8a56153b70b4d7dcfb8d74c"

RPROVIDES:${PN} += "librsvg \
librsvg-2-2 \
librsvg-2-2(aarch-64) \
librsvg-2.so.2()(64bit) \
librsvg2"
RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo-gobject.so.2()(64bit) \
libcairo.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libxml2.so.2(LIBXML2_2.7.0)(64bit)"

inherit rpm
