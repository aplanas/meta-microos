SUMMARY = "SDL Graphics Routines for Primitives and Other Support Functions"
DESCRIPTION = "The SDL_gfx library evolved out of the SDL_gfxPrimitives code which \
provided basic drawing routines such as lines, circles or polygons and \
SDL_rotozoom which implemented a interpolating rotozoomer for SDL \
surfaces."
LICENSE = "Zlib"

PV = "2.0.26"

RPM_NAME = "libSDL_gfx15-2.0.26-1.17.aarch64.rpm"
RPM_HASH = "c672f18a78ebffcea3e54a35d1347f7b8c4ce6bf3809b97728665048e0a0c0c96d3123e31411ad109a94bb97ee0d20777ad77ce55342bd111ec57cfec9278814"

RPROVIDES:${PN} += "SDL_gfx \
libSDL_gfx.so.15()(64bit) \
libSDL_gfx15 \
libSDL_gfx15(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libSDL-1.2.so.0()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
