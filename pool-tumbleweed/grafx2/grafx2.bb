SUMMARY = "Pixel Art editor"
DESCRIPTION = "GrafX2 is a bitmap paint program inspired by the Amiga programs Deluxe Paint and Brilliance."
LICENSE = "GPL-2.0-only"

PV = "2.8.3124"

RPM_NAME = "grafx2-2.8.3124-1.8.aarch64.rpm"
RPM_HASH = "81c599bb559cf7c00252420235cc096585b5915998fcbc0e33792b4f996ebe6c244338002ba893c52145b08098cc3b4f5656f63984552f1c8f9d3312927804df"

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
