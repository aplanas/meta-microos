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

RPM_NAME = "libSDL_gfx-devel-2.0.26-1.17.aarch64.rpm"
RPM_HASH = "b7414d4b9ea6f8c7451637562f0ab1b244e3b773cc39dfb6fe3a3238d8e196a196bec743ad65ffe054e32195cbbbf36711eacbbbbd1536efe5f3a1f0f8fa5cf0"

RPROVIDES:${PN} += "SDL-gfx-devel \
libSDL-gfx-devel \
pkgconfig-SDL-gfx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSDL-gfx15 \
pkgconfig-sdl"

inherit rpm
