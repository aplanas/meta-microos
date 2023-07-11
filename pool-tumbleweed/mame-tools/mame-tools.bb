SUMMARY = "MAME Tools"
DESCRIPTION = "Tools for use with MAME/MESS roms and images."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.254"

RPM_NAME = "mame-tools-0.254-1.2.aarch64.rpm"
RPM_HASH = "b1f4208f11a6ebe3f7d1781745a3ec1b675220e5a85050e240328ea7dec739384cfea9fb3314a6551a0fabc8f4155bf7505b2cefbd5d684bcc8283cd51a2c879"

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
