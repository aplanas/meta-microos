SUMMARY = "Insanely fast image printing in your terminal"
DESCRIPTION = "catimg is a little program written in C with no dependencies that prints images in terminal. It supports JPEG, PNG and GIF formats. This program was originally a script that did the same by using ImageMagick convert."
LICENSE = "MIT"

PV = "2.7.0"

RPM_NAME = "catimg-2.7.0-1.6.aarch64.rpm"
RPM_HASH = "3c680116627b622b3e80d1068a3cbc808ae6ad28c9f83d6224172b11182c4a0f806e7f64012c57d2246492099f28ae8f4af801609093fb234546fec5d0ef6e45"

RPROVIDES:${PN} += "catimg catimg(aarch-64)"
RDEPENDS:${PN} += "ImageMagick ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
