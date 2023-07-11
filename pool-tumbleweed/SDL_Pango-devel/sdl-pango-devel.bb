SUMMARY = "Headers for SDL_Pango development"
DESCRIPTION = "This package contains the necessary include files and libraries needed \
to develop applications that require SDL_Pango."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.2"

RPM_NAME = "SDL_Pango-devel-0.1.2-240.6.aarch64.rpm"
RPM_HASH = "1edb9197ea3dccd2d32d1be3b436e183ec4c18a930a707ed3189a92bbbaeed2a9a16b55117d447155809a66fe69c856efebb1aed42fcd66835715f2f80ea226c"

RPROVIDES:${PN} += "SDL-Pango-devel \
libSDL-Pango-devel \
pkgconfig-SDL-Pango"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSDL-Pango1 \
pkgconfig-pango \
pkgconfig-sdl"

inherit rpm
