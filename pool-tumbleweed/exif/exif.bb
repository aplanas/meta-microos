SUMMARY = "Small Command Line Utility to Show and Change EXIF Information in JPEG Files"
DESCRIPTION = "Exif is a small command line utility to show and change EXIF \
information hidden in JPEG files. It demonstrate the power of libexif \
library."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.22"

RPM_NAME = "exif-0.6.22-2.12.aarch64.rpm"
RPM_HASH = "5648fa4b18ac3e1a947aa14f86309e44419e587bc167a61852b18e387cbe71079085664516d2efd05f5e8ef45c99b819b805a4c0b15afa51025a6d5c6421b044"

RPROVIDES:${PN} += "exif"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexif.so.12 \
libpopt.so.0"

inherit rpm
