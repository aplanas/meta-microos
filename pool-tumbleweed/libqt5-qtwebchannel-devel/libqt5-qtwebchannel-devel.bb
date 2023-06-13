SUMMARY = "Development files for the Qt5 WebChannel library"
DESCRIPTION = "You need this package if you want to compile programs with qtwebchannel."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde3"

RPM_NAME = "libqt5-qtwebchannel-devel-5.15.9+kde3-1.1.aarch64.rpm"
RPM_HASH = "15e0f4123d64149d9926e1f601ce6c13a7ca5e21369db010cc2a2e40fa06b7cc92852b8ba75b3ebb28f294c4081deb6aa4e3c1d053a2337ca582d6c3a6d4a4f4"

RPROVIDES:${PN} += "cmake(Qt5WebChannel) \
libqt5-qtwebchannel-devel \
libqt5-qtwebchannel-devel(aarch-64) \
pkgconfig(Qt5WebChannel)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5WebChannel5 \
pkgconfig(Qt5Core) \
pkgconfig(Qt5Qml)"

inherit rpm
