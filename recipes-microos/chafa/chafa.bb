SUMMARY = "Image-to-text converter for terminal"
DESCRIPTION = "Chafa is a command-line utility that converts all kinds of images, including \
animated image formats like GIFs, into ANSI/Unicode character output that can \
be displayed in a terminal."
LICENSE = "LGPL-3.0-or-later"

PV = "1.12.4"

RPM_NAME = "chafa-1.12.4-1.3.aarch64.rpm"
RPM_HASH = "53a5918a69d67b87d1ec75911df7d85b58ce96d1bb1b5652c7e95019c140da200e997e683e360f832b5138c2e284e1018239f4ce04de8274789fdbece848bbb9"

RPROVIDES:${PN} += "chafa chafa(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libMagickWand-7.Q16HDRI.so.10()(64bit) libMagickWand-7.Q16HDRI.so.10(VERS_10.0)(64bit) libc.so.6(GLIBC_2.34)(64bit) libchafa.so.0()(64bit) libchafa0 libfreetype.so.6()(64bit) libglib-2.0.so.0()(64bit)"

inherit rpm
