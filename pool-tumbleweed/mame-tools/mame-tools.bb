SUMMARY = "MAME Tools"
DESCRIPTION = "Tools for use with MAME/MESS roms and images."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.254"

RPM_NAME = "mame-tools-0.254-1.1.aarch64.rpm"
RPM_HASH = "bee71c21e9e5fb01013948f5fb1ec13a939b035307eebb3fcd40e39d1661715ff2e3ffdc3547b6f445ee169613e145fc3dbc71ff84859fcf5fc7548b832207ac"

RPROVIDES:${PN} += "mame-tools"

RDEPENDS:${PN} += "libFLAC.so.12 \
libSDL2-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libutf8proc.so.2 \
libz.so.1"

inherit rpm
