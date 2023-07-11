SUMMARY = "Simple DirectMedia Layer 2 – Networking library"
DESCRIPTION = "This is a networking library for use with SDL."
LICENSE = "Zlib"

PV = "2.2.0"

RPM_NAME = "libSDL2_net-2_0-0-2.2.0-1.3.aarch64.rpm"
RPM_HASH = "252db1d5205b38088ff248bb75423b5a0ee6dfb3ce431c778bbde22425f46348d425961a8f5d3c9a8ed114b7f629507b86d1b4e11bba08985bccb6578380d525"

RPROVIDES:${PN} += "SDL2-net \
libSDL2-net-2-0-0 \
libSDL2-net-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6"

inherit rpm
