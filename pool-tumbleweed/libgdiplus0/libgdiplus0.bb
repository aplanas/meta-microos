SUMMARY = "Open Source Implementation of the GDI+ API"
DESCRIPTION = "Mono library that provide a GDI+ comptible API on non-Windows \
operating systems."
LICENSE = "(LGPL-2.1-or-later | MPL-1.1) & MIT"

PV = "6.0.5"

RPM_NAME = "libgdiplus0-6.0.5-1.11.aarch64.rpm"
RPM_HASH = "f1195738aef8dc10568b79ec7ba64a15186c2fcab736e14be2c8402fa2ecfaa0975d7c54151384d33ce07615cad78c45338882eeb15cf01511a21f5df9ebf226"

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
