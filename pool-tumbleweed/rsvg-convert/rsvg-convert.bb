SUMMARY = "SVG Convert using the GNOME Render SVG library"
DESCRIPTION = "This package contains a tool to convert SVG (scalable vector \
graphics) data. This format has been specified by the W3C (see \
http://www.w3c.org)."
LICENSE = "LGPL-2.0-or-later"

PV = "2.56.1"

RPM_NAME = "rsvg-convert-2.56.1-1.1.aarch64.rpm"
RPM_HASH = "27bbecd629e0d9d67458867b0ad08b7b29704c6dc9098797d022079c8c3f82fc28b04514cbc5870d831d5f1aed28c2a0501b4542c2f8e1aed92f80e7069c4c88"

RPROVIDES:${PN} += "rsvg-convert \
rsvg-convert(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
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
