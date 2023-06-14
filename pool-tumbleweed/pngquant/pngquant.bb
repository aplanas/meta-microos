SUMMARY = "Tool for lossy compression of PNG images"
DESCRIPTION = "pngquant is a command-line utility and a library for lossy \
compression of PNG images. \
 \
The conversion reduces file sizes by converting images to 1/2/4/8-bit \
paletted PNG format with alpha channel (often 60-80% smaller than \
24/32-bit PNG files). Generated images are compatible with all modern \
web browsers, and have better fallback in IE6 than 24-bit PNGs."
LICENSE = "GPL-3.0-or-later"

PV = "2.18.0"

RPM_NAME = "pngquant-2.18.0-1.2.aarch64.rpm"
RPM_HASH = "59f8f905803940f412756eb39026d649da71becadc9bd464f169ab1edb48f7602c0e88026573547ee15a1bee14480dd0e16dab7284198ae4eb9c523b23dfe86f"

RPROVIDES:${PN} += "pngquant"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
libimagequant.so.0 \
liblcms2.so.2 \
libm.so.6 \
libpng16.so.16"

inherit rpm
