SUMMARY = "A TrueType Font Library"
DESCRIPTION = "This library features TrueType fonts for open source projects. This \
version also contains an autohinter for producing improved output."
LICENSE = "FTL & GPL-2.0-only"

PV = "2.13.0"

RPM_NAME = "libfreetype6-2.13.0-4.1.aarch64.rpm"
RPM_HASH = "50880d2cf1bd7d4e8b59fdc667b9c42232754d11d1b7f610ad1613fee82217f1b6c4ef4b0ec00110ff2e9dc6b0fdd3ad8dfb2f5599a6448b109e24c8ef4b5154"

RPROVIDES:${PN} += "freetype2 \
libfreetype.so.6 \
libfreetype6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbrotlidec.so.1 \
libbz2.so.1 \
libc.so.6 \
libpng16.so.16 \
libz.so.1"

inherit rpm
