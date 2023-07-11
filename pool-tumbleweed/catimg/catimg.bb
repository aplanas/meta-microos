SUMMARY = "Insanely fast image printing in your terminal"
DESCRIPTION = "catimg is a little program written in C with no dependencies that prints images in terminal. It supports JPEG, PNG and GIF formats. This program was originally a script that did the same by using ImageMagick convert."
LICENSE = "MIT"

PV = "2.7.0"

RPM_NAME = "catimg-2.7.0-1.7.aarch64.rpm"
RPM_HASH = "83f8b91fd815b91966e5da4e66372a2219736c462e95306d7cef60b2f03806678d6731dba3dc99128f8fd81f752ba738f5617b78a77467b5c4644cb0bae1ea16"

RPROVIDES:${PN} += "catimg"

RDEPENDS:${PN} += "ImageMagick \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
