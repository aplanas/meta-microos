SUMMARY = "Simple DirectMedia Layer – Image loading library"
DESCRIPTION = "This is a simple library to load images of various formats as SDL \
surfaces. This library supports the BMP, PPM, PCX, GIF, JPEG, PNG, \
TIFF and WEBP formats."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.12+hg695"

RPM_NAME = "libSDL_image-1_2-0-1.2.12+hg695-1.14.aarch64.rpm"
RPM_HASH = "2303e36e62052d88dbf456fe6dc38889a317b3ed0a876dacba98aa28fa259345143e5729fffc3c06f827394125aae4b1917f9d2c345f886ea39e7e08ead2e956"

RPROVIDES:${PN} += "SDL_image \
libSDL_image-1.2.so.0()(64bit) \
libSDL_image-1_2-0 \
libSDL_image-1_2-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libSDL-1.2.so.0()(64bit) \
libc.so.6()(64bit) \
libjpeg.so.8()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libtiff.so.6()(64bit) \
libwebp.so.7()(64bit)"

inherit rpm
