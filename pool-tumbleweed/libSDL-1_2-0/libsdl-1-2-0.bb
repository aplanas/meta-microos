SUMMARY = "SDL Graphics Routines for Primitives and Other Support Functions"
DESCRIPTION = "This is the 'Simple DirectMedia Layer' library built from sdl12_compat. \
it provides a binary and source compatible API for programs written \
against SDL 1.2, but it uses SDL 2.0 behind the scenes."
LICENSE = "MIT"

PV = "1.2.64"

RPM_NAME = "libSDL-1_2-0-1.2.64-1.1.aarch64.rpm"
RPM_HASH = "4b4da3226308060a71898ccdd74100ce0a80e28258f4a64177eff44c8ec06fec3d51922357fd9f0c2457f64ebeda4ede6ba1778a93ccc357f06d2f0490db5240"

RPROVIDES:${PN} += "libSDL-1.2.so.0()(64bit) \
libSDL-1_2-0 \
libSDL-1_2-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libSDL2-2_0-0 \
libc.so.6()(64bit)"

inherit rpm
