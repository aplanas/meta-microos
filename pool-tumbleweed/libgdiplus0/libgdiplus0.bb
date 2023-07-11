SUMMARY = "Open Source Implementation of the GDI+ API"
DESCRIPTION = "Mono library that provide a GDI+ comptible API on non-Windows \
operating systems."
LICENSE = "(LGPL-2.1-or-later | MPL-1.1) & MIT"

PV = "6.0.5"

RPM_NAME = "libgdiplus0-6.0.5-1.12.aarch64.rpm"
RPM_HASH = "045dbb4e4416bdbbe2033a17139cfb470ba7110b4e3ffa7d79728f832be9689a887de6b725cd897df8dc91d4d62c7839b8ea19f09a1c67116200c9f76661e245"

RPROVIDES:${PN} += "libgdiplus.so.0 \
libgdiplus0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libexif.so.12 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgif.so.7 \
libglib-2.0.so.0 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libtiff.so.6"

inherit rpm
