SUMMARY = "A Quake Engine"
DESCRIPTION = "QuakeSpasm is a Quake 1 engine based on the SDL2 port of FitzQuake.  It includes \
64-bit CPU support, a new sound driver, several networking fixes and a few \
graphical niceities, while also staying true to the original game. \
Game data must be placed in ~/.quakespasm/id1 ."
LICENSE = "GPL-2.0-or-later"

PV = "0.95.1"

RPM_NAME = "quakespasm-0.95.1-1.4.aarch64.rpm"
RPM_HASH = "775ba6a0629fb88945ef1477a053a2972d2fbe1f6d60b06fc4a1bd270c1c45a01c6003b8e5c73ff3e6e49de6287d6fa7264875b8dba83cd7252c42a6e0f51b4b"

RPROVIDES:${PN} += "quakespasm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libm.so.6 \
libvorbisfile.so.3"

inherit rpm
