SUMMARY = "Image-to-text converter for terminal"
DESCRIPTION = "Chafa is a command-line utility that converts all kinds of images, including \
animated image formats like GIFs, into ANSI/Unicode character output that can \
be displayed in a terminal."
LICENSE = "LGPL-3.0-or-later"

PV = "1.12.5"

RPM_NAME = "chafa-1.12.5-1.1.aarch64.rpm"
RPM_HASH = "8ff27dfbadd156533efe7ef7bc39ef3f426c26dbb82fba167fbb3bfb80a440ce6ceee5cf7f733198189a04e7a46066ac8e68b0df07c2761c6cf3bb6288706294"

RPROVIDES:${PN} += "chafa \
chafa(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libMagickWand-7.Q16HDRI.so.10()(64bit) \
libMagickWand-7.Q16HDRI.so.10(VERS_10.0)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libchafa.so.0()(64bit) \
libchafa0 \
libfreetype.so.6()(64bit) \
libglib-2.0.so.0()(64bit)"

inherit rpm
