SUMMARY = "Development files for the Single Sign On Framework's plugins"
DESCRIPTION = "This package contains the development files necessary for creating plugins for \
the Single Sign On Framework."
LICENSE = "LGPL-2.0-only"

PV = "8.61"

RPM_NAME = "signon-plugins-devel-8.61-1.1.aarch64.rpm"
RPM_HASH = "eeb91d682627061b7673da52bc1fd3dedfef00ece3de0e94db5da531b633430f3cc12979b1ea409720544a4ff4fe85b992e1eb6a3d3541519fd02cf1c1dfae4b"

RPROVIDES:${PN} += "pkgconfig-signon-plugins \
pkgconfig-signon-plugins-common \
signon-plugins-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsignon-qt5-devel \
pkgconfig-libsignon-qt5 \
signon-plugins"

inherit rpm
