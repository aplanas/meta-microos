SUMMARY = "Digital Camera JPEG image transformation utility"
DESCRIPTION = "exiftran is a command-line utility to transform digital image JPEG \
images. It can do lossless rotations like jpegtran, but unlike \
jpegtran, it cares about the EXIF data.  It can rotate images \
automatically by checking the EXIF orientation tag, updating the EXIF \
information if needed (image dimension, orientation), and also rotating \
the EXIF thumbnail. It can process multiple images at once."
LICENSE = "LGPL-2.1-or-later"

PV = "2.14"

RPM_NAME = "exiftran-2.14-4.2.aarch64.rpm"
RPM_HASH = "0113f3e707b6ba70735e340cbf74e856b27f218a9abfcc24bc2f4abfeadda001855b7e8f25f00398b866a2b16f6f8fcd0d7fb8483d182592d2fac955b1e7af05"

RPROVIDES:${PN} += "exiftran"

RDEPENDS:${PN} += "libc.so.6 \
libexif.so.12 \
libjpeg.so.8 \
libm.so.6 \
libpixman-1.so.0"

inherit rpm
