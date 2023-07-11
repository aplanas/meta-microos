SUMMARY = "Libraries, includes and more to develop SDL_image applications"
DESCRIPTION = "This is a simple library to load images of various formats as SDL \
surfaces. This library supports the BMP, PPM, PCX, GIF, JPEG, PNG, \
TIFF and WEBP formats."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.12+hg695"

RPM_NAME = "libSDL_image-devel-1.2.12+hg695-1.15.aarch64.rpm"
RPM_HASH = "5cef22fa22d1760c0ca9ed0b8552e073b1c2d147f4f95af32b350c11b1aeb8cd71db7b14c019132c6547069b708e69dd0490d732044dd8252d9f0625c4f2667c"

RPROVIDES:${PN} += "SDL-image-devel \
libSDL-image-devel \
pkgconfig-SDL-image"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSDL-image-1-2-0 \
pkgconfig-sdl"

inherit rpm
