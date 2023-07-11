SUMMARY = "SDL Graphics Routines for Primitives and Other Support Functions"
DESCRIPTION = "SDL_bgi is a Borland Graphics Interface (BGI) emulation library for \
SDL. It provides extensions for RGB colors and mouse support."
LICENSE = "GPL-2.0-or-later & Zlib"

PV = "3.0.0"

RPM_NAME = "libSDL_bgi-suse9-3.0.0-1.4.aarch64.rpm"
RPM_HASH = "e898cc26b0c5185e5f75d54a7fa241ccfc7262380cfceae672d4745e49688ba2ce291835afc2bb5760d17371e23277020457a56db24c0774f6c2cf7235a8eae7"

RPROVIDES:${PN} += "libSDL-bgi-suse9 \
libSDL-bgi.so.suse9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm
