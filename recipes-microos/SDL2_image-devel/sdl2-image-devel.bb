SUMMARY = "Development files for the SDL2 image loader library"
DESCRIPTION = "This is a simple library to load images of various formats as SDL \
surfaces. This library supports the BMP, PPM, PCX, GIF, JPEG, PNG, \
TIFF and WEBP formats."
LICENSE = "Zlib"

PV = "2.6.3"

RPM_NAME = "SDL2_image-devel-2.6.3-1.3.aarch64.rpm"
RPM_HASH = "fa831302af1b421dd18713280bb632e0ca507f016d12040ec2493a445476f3ae122352981f5ea183a1b89c442bee62137001abc00a946b2d5633982e2c7735a2"

RPROVIDES:${PN} += "SDL2_image-devel SDL2_image-devel(aarch-64) libSDL2_image-devel pkgconfig(SDL2_image)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libSDL2_image-2_0-0 pkgconfig(libjpeg) pkgconfig(libjxl) pkgconfig(libpng) pkgconfig(libtiff-4) pkgconfig(libwebp) pkgconfig(sdl2)"

inherit rpm
