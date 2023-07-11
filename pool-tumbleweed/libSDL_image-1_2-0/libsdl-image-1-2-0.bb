SUMMARY = "Simple DirectMedia Layer – Image loading library"
DESCRIPTION = "This is a simple library to load images of various formats as SDL \
surfaces. This library supports the BMP, PPM, PCX, GIF, JPEG, PNG, \
TIFF and WEBP formats."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.12+hg695"

RPM_NAME = "libSDL_image-1_2-0-1.2.12+hg695-1.15.aarch64.rpm"
RPM_HASH = "c4f744f7eeaa0b851173e605cc9ac7a6b504770b136c9066dfffe2638f4766d8543275e97db8f5945344eaf193c8e1767901246d96ca398569fbe4d513f8019e"

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
