SUMMARY = "Pixel Art editor"
DESCRIPTION = "GrafX2 is a bitmap paint program inspired by the Amiga programs Deluxe Paint and Brilliance."
LICENSE = "GPL-2.0-only"

PV = "2.8.3124"

RPM_NAME = "grafx2-2.8.3124-1.7.aarch64.rpm"
RPM_HASH = "ef2f57b549c5b40087deba5ef858bc198e61bcb29dd775ad51dfcad8bbde4abf66807334b4890519826bd29a051fa638671e43b3474d18828acc757cc590532b"

RPROVIDES:${PN} += "grafx2"

RDEPENDS:${PN} += "libSDL-1.2.so.0 \
libSDL-image-1.2.so.0 \
libSDL-ttf-2.0.so.0 \
libX11.so.6 \
libc.so.6 \
libfontconfig.so.1 \
liblua5.4.so.5 \
libm.so.6 \
libpng16.so.16 \
libtiff.so.6 \
libz.so.1"

inherit rpm
