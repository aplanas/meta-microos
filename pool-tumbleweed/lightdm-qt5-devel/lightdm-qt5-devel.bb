SUMMARY = "Development Files for liblightdm-qt5-3-0"
DESCRIPTION = "This package contains development files needed for developing \
Qt5-based LightDM clients."
LICENSE = "LGPL-2.0-only | LGPL-3.0-only"

PV = "1.32.0"

RPM_NAME = "lightdm-qt5-devel-1.32.0-2.3.aarch64.rpm"
RPM_HASH = "6f13a2777695b577cc7a5ae15c1438297a472c4d0e059ab2f67c5f9a91026964bf1bb11d496a919ca34ba0c80b91c1bc3cd2383d1845cda189c3080a39a78339"

RPROVIDES:${PN} += "lightdm-qt-devel \
lightdm-qt5-devel \
pkgconfig-liblightdm-qt5-3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblightdm-qt5-3-0 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui"

inherit rpm
