SUMMARY = "SDL2 Graphics Routines for Primitives and Other Support Functions"
DESCRIPTION = "Library containing 20+ graphics primitives (line, box, circle, polygon, etc.) for SDL2."
LICENSE = "Zlib"

PV = "1.0.4"

RPM_NAME = "libSDL2_gfx-1_0-0-1.0.4-2.8.aarch64.rpm"
RPM_HASH = "9ad975e9ad6e8e23278e329e06d81e52b4a4e64669e913a13af2be84433e4fcab02963c43d2e8916333faa6acc455fb910959564bc713c8bf51ea8d28fef74e3"

RPROVIDES:${PN} += "SDL2-gfx \
libSDL2-gfx-1-0-0 \
libSDL2-gfx-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6"

inherit rpm
