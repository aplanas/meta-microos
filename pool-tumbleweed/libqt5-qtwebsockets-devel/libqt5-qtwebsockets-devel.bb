SUMMARY = "Development files for the Qt5 WebSockets library"
DESCRIPTION = "You need this package if you want to compile programs with QtWebSockets."
LICENSE = "LGPL-3.0-only |  (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde2"

RPM_NAME = "libqt5-qtwebsockets-devel-5.15.9+kde2-1.1.aarch64.rpm"
RPM_HASH = "61fee0de054900ff66328567e1e5262a8504676bda3d30c672ca03fe1bdb4093b446a359bcfb03ef7f233d2da0864b5f521231f79fa5fa417abcac01169bf7e7"

RPROVIDES:${PN} += "cmake(Qt5WebSockets) \
libqt5-qtwebsockets-devel \
libqt5-qtwebsockets-devel(aarch-64) \
pkgconfig(Qt5WebSockets)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5WebSockets5 \
pkgconfig(Qt5Core) \
pkgconfig(Qt5Network)"

inherit rpm
