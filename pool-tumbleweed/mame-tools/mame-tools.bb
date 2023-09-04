SUMMARY = "MAME Tools"
DESCRIPTION = "Tools for use with MAME/MESS roms and images."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.257"

RPM_NAME = "mame-tools-0.257-1.1.aarch64.rpm"
RPM_HASH = "eeb488dd1b6426a1a728835f1735c8f761b5f1478d4e77288077b03d22f3606ead72a44bbfb2f69e23c7b24fdb6e611ce9873be9699189fee43d96ae876f68b4"

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
