SUMMARY = "MinGW Windows compiler for C shared libraries"
DESCRIPTION = "MinGW Windows compiler for C shared libraries"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-libssp0-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "e07343b9a4eefc2d6bddb4dd59c8c8ca541cda9739fdf46c7badc72faed8346dc70d3d5d2f638a0b5dbeff0531d10b206ad901b0ab2d465e863efc3c7594ae0e"

RPROVIDES:${PN} += "mingw64-libssp \
mingw64-libssp-0.dll \
mingw64-libssp0"

RDEPENDS:${PN} += ""

inherit rpm
