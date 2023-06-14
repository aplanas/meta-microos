SUMMARY = "A Qt music player with support for favorites"
DESCRIPTION = "Babe is a music collection organizer. Playlists can be created for \
organizing music, and they can be filtered by artist, title, album, \
genre, date and location. It can link to, and bookmark YouTube music \
videos into the local collection by using a Chromium extension."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.1.1"

RPM_NAME = "babe-1.2.1.1-1.10.aarch64.rpm"
RPM_HASH = "4de5631fbad30b40948f7e4e3ff948e7aa6ee2f781a2028779162d4ded714018281006bdbab4ba738e4352d1ca62c665651fe86130b8cdd90196e2a632bf1d8d"

RPROVIDES:${PN} += "babe"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5I18n.so.5 \
libKF5Notifications.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Network.so.5 \
libQt5Sql.so.5 \
libQt5WebSockets.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
libtag.so.1"

inherit rpm
