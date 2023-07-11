SUMMARY = "Simple DirectMedia Layer – Truetype library"
DESCRIPTION = "This is a sample library that allows you to use TrueType fonts in your \
SDL applications."
LICENSE = "Zlib"

PV = "2.0.11"

RPM_NAME = "libSDL_ttf-2_0-0-2.0.11-7.26.aarch64.rpm"
RPM_HASH = "66061c3cd191d1d11ac131e09ebb70d880a2f5743d8a1aa0f5d02a4b9c5064443e16f65d7c635f88d354fb3a507ad6f20c17ff3af3c6980b289cd926b5e55931"

RPROVIDES:${PN} += "SDL-ttf \
libSDL-ttf-2-0-0 \
libSDL-ttf-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libc.so.6 \
libfreetype.so.6"

inherit rpm
