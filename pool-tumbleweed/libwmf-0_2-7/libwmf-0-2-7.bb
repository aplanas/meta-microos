SUMMARY = "Library for reading Metafile Images"
DESCRIPTION = "This library reads metafile images."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.13"

RPM_NAME = "libwmf-0_2-7-0.2.13-1.1.aarch64.rpm"
RPM_HASH = "de46db44521d996240bfcde23ab3124001ef0ff4c65bbbe569efeba8cf1e5abb1c1b59469e7559b08460fe3a15f98a07141069ebd3875259d7007abe715c239d"

RPROVIDES:${PN} += "libwmf-0-2-7 \
libwmf-0.2.so.7 \
libwmflite-0.2.so.7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libexpat.so.1 \
libfreetype.so.6 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libz.so.1"

inherit rpm
