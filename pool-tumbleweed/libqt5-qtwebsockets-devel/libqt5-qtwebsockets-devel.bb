SUMMARY = "Development files for the Qt5 WebSockets library"
DESCRIPTION = "You need this package if you want to compile programs with QtWebSockets."
LICENSE = "LGPL-3.0-only |  (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde2"

RPM_NAME = "libqt5-qtwebsockets-devel-5.15.10+kde2-1.1.aarch64.rpm"
RPM_HASH = "630565127651d6af708fefae35cf1923586f0799902f55a85f5ae648c1d74bdb95d0fb43e9ff4fdc45d02ea0ae11197af3f89fe146dc5fafe60e708ffdea2270"

RPROVIDES:${PN} += "cmake-Qt5WebSockets \
libqt5-qtwebsockets-devel \
pkgconfig-Qt5WebSockets"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5WebSockets5 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Network"

inherit rpm
