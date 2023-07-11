SUMMARY = "Library for image processing and image analysis applications"
DESCRIPTION = "Library for efficient image processing and image analysis operations."
LICENSE = "BSD-2-Clause"

PV = "1.83.1"

RPM_NAME = "libleptonica6-1.83.1-1.4.aarch64.rpm"
RPM_HASH = "69e6848d982484e00489bb6df7731afbedd95a4cf589e98432d7bff4c5c35d44d2548862ad67d4cc301c498a4cbb34528b6e56a8d68710f688efc4010a87e430"

RPROVIDES:${PN} += "liblept \
libleptonica.so.6 \
libleptonica6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgif.so.7 \
libjpeg.so.8 \
libm.so.6 \
libopenjp2.so.7 \
libpng16.so.16 \
libtiff.so.6 \
libwebp.so.7 \
libwebpmux.so.3 \
libz.so.1"

inherit rpm
