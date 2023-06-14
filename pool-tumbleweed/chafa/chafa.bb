SUMMARY = "Image-to-text converter for terminal"
DESCRIPTION = "Chafa is a command-line utility that converts all kinds of images, including \
animated image formats like GIFs, into ANSI/Unicode character output that can \
be displayed in a terminal."
LICENSE = "LGPL-3.0-or-later"

PV = "1.12.5"

RPM_NAME = "chafa-1.12.5-1.1.aarch64.rpm"
RPM_HASH = "8ff27dfbadd156533efe7ef7bc39ef3f426c26dbb82fba167fbb3bfb80a440ce6ceee5cf7f733198189a04e7a46066ac8e68b0df07c2761c6cf3bb6288706294"

RPROVIDES:${PN} += "chafa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libMagickWand-7.Q16HDRI.so.10 \
libc.so.6 \
libchafa.so.0 \
libchafa0 \
libfreetype.so.6 \
libglib-2.0.so.0"

inherit rpm
