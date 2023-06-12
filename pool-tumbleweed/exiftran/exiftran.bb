SUMMARY = "Digital Camera JPEG image transformation utility"
DESCRIPTION = "exiftran is a command-line utility to transform digital image JPEG \
images. It can do lossless rotations like jpegtran, but unlike \
jpegtran, it cares about the EXIF data.  It can rotate images \
automatically by checking the EXIF orientation tag, updating the EXIF \
information if needed (image dimension, orientation), and also rotating \
the EXIF thumbnail. It can process multiple images at once."
LICENSE = "LGPL-2.1-or-later"

PV = "2.14"

RPM_NAME = "exiftran-2.14-4.1.aarch64.rpm"
RPM_HASH = "d0aaf8fd732019b60be2eab612133a207ef674d17279b36f33c9c7d29b6832e7140478da7e74ea091edff0bb02c87776378e5e30f316b8ff7aacb178e604b3b1"

RPROVIDES:${PN} += "exiftran \
exiftran(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libexif.so.12()(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libpixman-1.so.0()(64bit)"

inherit rpm
