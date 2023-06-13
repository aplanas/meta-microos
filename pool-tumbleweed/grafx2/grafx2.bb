SUMMARY = "Pixel Art editor"
DESCRIPTION = "GrafX2 is a bitmap paint program inspired by the Amiga programs Deluxe Paint and Brilliance."
LICENSE = "GPL-2.0-only"

PV = "2.8.3124"

RPM_NAME = "grafx2-2.8.3124-1.7.aarch64.rpm"
RPM_HASH = "ef2f57b549c5b40087deba5ef858bc198e61bcb29dd775ad51dfcad8bbde4abf66807334b4890519826bd29a051fa638671e43b3474d18828acc757cc590532b"

RPROVIDES:${PN} += "application() \
application(grafx2.desktop) \
grafx2 \
grafx2(aarch-64) \
metainfo() \
metainfo(grafx2.appdata.xml) \
mimehandler(image/bmp) \
mimehandler(image/gif) \
mimehandler(image/iff) \
mimehandler(image/lbm) \
mimehandler(image/pcx) \
mimehandler(image/png) \
mimehandler(image/tga) \
mimehandler(image/x-icon)"

RDEPENDS:${PN} += "libSDL-1.2.so.0()(64bit) \
libSDL_image-1.2.so.0()(64bit) \
libSDL_ttf-2.0.so.0()(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfontconfig.so.1()(64bit) \
liblua5.4.so.5()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libtiff.so.6()(64bit) \
libtiff.so.6(LIBTIFF_4.0)(64bit) \
libz.so.1()(64bit)"

inherit rpm
