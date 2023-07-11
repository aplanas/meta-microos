SUMMARY = "SDL Graphics Routines for Primitives and Other Support Functions"
DESCRIPTION = "This is the 'Simple DirectMedia Layer' library built from sdl12_compat. \
it provides a binary and source compatible API for programs written \
against SDL 1.2, but it uses SDL 2.0 behind the scenes."
LICENSE = "MIT"

PV = "1.2.64"

RPM_NAME = "libSDL-1_2-0-1.2.64-1.3.aarch64.rpm"
RPM_HASH = "e61088929cab02eccc1de882f3374e9dbe5b6eba017961f38b7cd4e0c70e2a7ac8f1ada0c48c124b3634e8245d4c872eda5924bd24890c32f461963dd2f5c99c"

RPROVIDES:${PN} += "libSDL-1-2-0 \
libSDL-1.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL2-2-0-0 \
libc.so.6"

inherit rpm
