SUMMARY = "Development files for the SDL2 image loader library"
DESCRIPTION = "This is a simple library to load images of various formats as SDL \
surfaces. This library supports the BMP, PPM, PCX, GIF, JPEG, PNG, \
TIFF and WEBP formats."
LICENSE = "Zlib"

PV = "2.6.3"

RPM_NAME = "SDL2_image-devel-2.6.3-1.4.aarch64.rpm"
RPM_HASH = "669120e86286bdf6cc5382375c917307ee5ef15c529b62498b7af3b86a0c0f4b601027dcfc93c80389d862b659b98357b6848a8f09ca27875b4f9a3b0c802374"

RPROVIDES:${PN} += "SDL2-image-devel \
libSDL2-image-devel \
pkgconfig-SDL2-image"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSDL2-image-2-0-0 \
pkgconfig-libjpeg \
pkgconfig-libjxl \
pkgconfig-libpng \
pkgconfig-libtiff-4 \
pkgconfig-libwebp \
pkgconfig-sdl2"

inherit rpm
