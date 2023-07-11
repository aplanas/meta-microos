SUMMARY = "SDL Graphics Routines for Primitives and Other Support Functions"
DESCRIPTION = "The SDL_gfx library evolved out of the SDL_gfxPrimitives code which \
provided basic drawing routines such as lines, circles or polygons and \
SDL_rotozoom which implemented a interpolating rotozoomer for SDL \
surfaces."
LICENSE = "Zlib"

PV = "2.0.26"

RPM_NAME = "libSDL_gfx15-2.0.26-1.18.aarch64.rpm"
RPM_HASH = "087985e1b316894203966a1ee00e8e9bdef72a7f34c674ba83f3102c49fbe6066377e430cdec66007b0bff189968840f2dad495746d3e066c335d2c5f619e8e5"

RPROVIDES:${PN} += "SDL-gfx \
libSDL-gfx.so.15 \
libSDL-gfx15"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm
