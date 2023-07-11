SUMMARY = "Development files for the SDL networking library"
DESCRIPTION = "This is a small cross-platform networking library for use with SDL."
LICENSE = "LGPL-2.1+"

PV = "1.2.8"

RPM_NAME = "libSDL_net-devel-1.2.8-7.27.aarch64.rpm"
RPM_HASH = "f713ae1a5be749e66207b17cbc7d4487a4a371ae08184847641a4cfcc00c4ea0b0d1fe71ca6b67f1473f0ec0e61e09230c0fea290127e493c23cccfa3b04ccf3"

RPROVIDES:${PN} += "SDL-net-devel \
libSDL-net-devel \
pkgconfig-SDL-net"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSDL-net-1-2-0 \
pkgconfig-sdl"

inherit rpm
