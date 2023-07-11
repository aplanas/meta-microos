SUMMARY = "Simple DirectMedia Layer 2 image loading library"
DESCRIPTION = "This is a simple library to load images of various formats as SDL \
surfaces. This library supports the BMP, PPM, PCX, GIF, JPEG, PNG, \
TIFF and WEBP formats."
LICENSE = "Zlib"

PV = "2.6.3"

RPM_NAME = "libSDL2_image-2_0-0-2.6.3-1.4.aarch64.rpm"
RPM_HASH = "af1b797b565f1c64328b69c0464334b52e68a62d8c58afd9ffb9d044dc158eeced0296ab5d42c38f25b317a9159a79cd5f482951085881c683270f777d2fd996"

RPROVIDES:${PN} += "SDL2-image \
libSDL2-image-2-0-0 \
libSDL2-image-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libjpeg.so.8 \
libjxl.so.0.8 \
libpng16.so.16 \
libtiff.so.6 \
libwebp.so.7"

inherit rpm
