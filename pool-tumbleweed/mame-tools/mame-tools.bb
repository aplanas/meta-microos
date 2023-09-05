SUMMARY = "MAME Tools"
DESCRIPTION = "Tools for use with MAME/MESS roms and images."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.258"

RPM_NAME = "mame-tools-0.258-1.1.aarch64.rpm"
RPM_HASH = "22b1f5db42dbf6e0004364b1deeaf6664273e1a4c8f4e13426a35e049dcbf2e5d2b24ce3d42b005e5166be43ad148ce838e678eeba862911b8ee1dc396e85c26"

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
