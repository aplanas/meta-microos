SUMMARY = "Libraries, includes and more to develop SDL_gfx applications"
DESCRIPTION = "The SDL_gfx library evolved out of the SDL_gfxPrimitives code which \
provided basic drawing routines such as lines, circles or polygons and \
SDL_rotozoom which implemented a interpolating rotozoomer for SDL \
surfaces. The current components of the SDL_gfx library are: \
 \
- Graphic Primitives (SDL_gfxPrimitves.h) \
 \
- Rotozoomer (SDL_rotozoom.h) \
 \
- Framerate control (SDL_framerate.h) \
 \
- MMX image filters (SDL_imageFilter.h) \
 \
The library is backwards compatible to the above mentioned code. It is \
written in plain C and can be used in C++ code."
LICENSE = "Zlib"

PV = "2.0.26"

RPM_NAME = "libSDL_gfx-devel-2.0.26-1.18.aarch64.rpm"
RPM_HASH = "197fcbc6a947bfc1ca12844b84d31d1a7c94135d348c014791f2d95b2b45e9fc9c0c020e2ec6168eaf4ab376a9bd6e5a3f9ffa2211c54934488b22c14eb20aa0"

RPROVIDES:${PN} += "SDL-gfx-devel \
libSDL-gfx-devel \
pkgconfig-SDL-gfx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSDL-gfx15 \
pkgconfig-sdl"

inherit rpm
