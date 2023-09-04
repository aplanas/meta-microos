SUMMARY = "SDL Graphics Routines for Primitives and Other Support Functions"
DESCRIPTION = "This is the 'Simple DirectMedia Layer' library built from sdl12_compat. \
it provides a binary and source compatible API for programs written \
against SDL 1.2, but it uses SDL 2.0 behind the scenes."
LICENSE = "MIT"

PV = "1.2.64"

RPM_NAME = "libSDL-1_2-0-1.2.64-1.4.aarch64.rpm"
RPM_HASH = "2ba0c73303ee825e64067870893a6c81c54c882a6d752b8150793773591448b8d43c6de2392c4aaea7db771df53c1c0f5e7ac9ca8a5043dd70719d3b57568852"

RPROVIDES:${PN} += "libSDL-1-2-0 \
libSDL-1.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL2-2-0-0 \
libc.so.6"

inherit rpm
