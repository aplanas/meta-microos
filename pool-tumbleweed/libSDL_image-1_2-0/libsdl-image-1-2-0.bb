SUMMARY = "Simple DirectMedia Layer – Image loading library"
DESCRIPTION = "This is a simple library to load images of various formats as SDL \
surfaces. This library supports the BMP, PPM, PCX, GIF, JPEG, PNG, \
TIFF and WEBP formats."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.12+hg695"

RPM_NAME = "libSDL_image-1_2-0-1.2.12+hg695-1.14.aarch64.rpm"
RPM_HASH = "2303e36e62052d88dbf456fe6dc38889a317b3ed0a876dacba98aa28fa259345143e5729fffc3c06f827394125aae4b1917f9d2c345f886ea39e7e08ead2e956"

RPROVIDES:${PN} += "SDL-image \
libSDL-image-1-2-0 \
libSDL-image-1.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libc.so.6 \
libjpeg.so.8 \
libpng16.so.16 \
libtiff.so.6 \
libwebp.so.7"

inherit rpm
