SUMMARY = "SDL Graphics Routines for Primitives and Other Support Functions"
DESCRIPTION = "SDL_bgi is a Borland Graphics Interface (BGI) emulation library for \
SDL. It provides extensions for RGB colors and mouse support."
LICENSE = "GPL-2.0-or-later & Zlib"

PV = "3.0.0"

RPM_NAME = "libSDL_bgi-suse9-3.0.0-1.3.aarch64.rpm"
RPM_HASH = "846cb90a2168f71b20a888b88f5718cba7b77098f5eafad4712af06cfb8bc44cbd09ba32354119d980da3afcb78120004d3ef5153acf6ce47b0f592f96fce320"

RPROVIDES:${PN} += "libSDL_bgi-suse9 \
libSDL_bgi-suse9(aarch-64) \
libSDL_bgi.so.suse9()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
