SUMMARY = "Libraries, includes and more to develop SDL_bgi applications"
DESCRIPTION = "SDL_bgi is a Borland Graphics Interface (BGI) emulation library for \
SDL. It provides extensions for RGB colors and mouse support. \
 \
Unlike other BGI-compatible libraries, the purpose of SDL_bgi is not \
full compatibility with BGI. Rather, it is meant to be an \
introduction to SDL-based graphics: SDL and BGI commands can be mixed \
together."
LICENSE = "GPL-2.0-or-later & Zlib"

PV = "3.0.0"

RPM_NAME = "libSDL_bgi-devel-3.0.0-1.4.aarch64.rpm"
RPM_HASH = "b69c9c38df54786177383f2592ddc211f3564ea871aad8967a1528db2645f5b6bf0979058824a1e004d671a184f6353dca68bf1f3fcdf70161c46f21ea77dd37"

RPROVIDES:${PN} += "SDL-bgi-devel \
libSDL-bgi-devel"

RDEPENDS:${PN} += "libSDL-bgi-suse9"

inherit rpm
