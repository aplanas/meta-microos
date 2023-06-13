SUMMARY = "Library for reading Metafile Images"
DESCRIPTION = "This library reads metafile images."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.13"

RPM_NAME = "libwmf-0_2-7-0.2.13-1.1.aarch64.rpm"
RPM_HASH = "de46db44521d996240bfcde23ab3124001ef0ff4c65bbbe569efeba8cf1e5abb1c1b59469e7559b08460fe3a15f98a07141069ebd3875259d7007abe715c239d"

RPROVIDES:${PN} += "libwmf-0.2.so.7()(64bit) \
libwmf-0_2-7 \
libwmf-0_2-7(aarch-64) \
libwmflite-0.2.so.7()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libexpat.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libjpeg.so.8()(64bit) \
libm.so.6()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libz.so.1()(64bit)"

inherit rpm
