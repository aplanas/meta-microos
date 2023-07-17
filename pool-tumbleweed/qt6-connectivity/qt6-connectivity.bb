SUMMARY = "Qt 6 connectivity tools and libraries"
DESCRIPTION = "Qt 6 connectivity tools and libraries."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-connectivity-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "200b8b5d795b9d607deafabb3b0b2c0bca695d474cf910fecb159f2cc5e31cdb0119a3fe51363870e3f61ba628e560bf08d3284f0c07dc48726ccc985338b393"

RPROVIDES:${PN} += "qt6-connectivity"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libbluetooth.so.3 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
