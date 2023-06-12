SUMMARY = "A Qt music player with support for favorites"
DESCRIPTION = "Babe is a music collection organizer. Playlists can be created for \
organizing music, and they can be filtered by artist, title, album, \
genre, date and location. It can link to, and bookmark YouTube music \
videos into the local collection by using a Chromium extension."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.1.1"

RPM_NAME = "babe-1.2.1.1-1.10.aarch64.rpm"
RPM_HASH = "4de5631fbad30b40948f7e4e3ff948e7aa6ee2f781a2028779162d4ded714018281006bdbab4ba738e4352d1ca62c665651fe86130b8cdd90196e2a632bf1d8d"

RPROVIDES:${PN} += "application() \
application(org.kde.babe.desktop) \
babe \
babe(aarch-64) \
metainfo() \
metainfo(org.kde.babe.appdata.xml) \
mimehandler(application/ogg) \
mimehandler(application/sdp) \
mimehandler(application/smil) \
mimehandler(application/streamingmedia) \
mimehandler(application/vnd.rn-realmedia) \
mimehandler(application/vnd.rn-realmedia-vbr) \
mimehandler(application/x-ogg) \
mimehandler(application/x-smil) \
mimehandler(application/x-streamingmedia) \
mimehandler(audio/AMR) \
mimehandler(audio/aac) \
mimehandler(audio/ac3) \
mimehandler(audio/flac) \
mimehandler(audio/m4a) \
mimehandler(audio/mp1) \
mimehandler(audio/mp2) \
mimehandler(audio/mp3) \
mimehandler(audio/mp4) \
mimehandler(audio/mpeg) \
mimehandler(audio/mpegurl) \
mimehandler(audio/mpg) \
mimehandler(audio/ogg) \
mimehandler(audio/rn-mpeg) \
mimehandler(audio/scpls) \
mimehandler(audio/vnd.rn-realaudio) \
mimehandler(audio/wav) \
mimehandler(audio/x-aac) \
mimehandler(audio/x-ape) \
mimehandler(audio/x-flac) \
mimehandler(audio/x-m4a) \
mimehandler(audio/x-mp1) \
mimehandler(audio/x-mp2) \
mimehandler(audio/x-mp3) \
mimehandler(audio/x-mpeg) \
mimehandler(audio/x-mpegurl) \
mimehandler(audio/x-mpg) \
mimehandler(audio/x-ms-wma) \
mimehandler(audio/x-pls) \
mimehandler(audio/x-pn-realaudio) \
mimehandler(audio/x-pn-windows-pcm) \
mimehandler(audio/x-realaudio) \
mimehandler(audio/x-scpls) \
mimehandler(audio/x-shorten) \
mimehandler(audio/x-tta) \
mimehandler(audio/x-vorbis+ogg) \
mimehandler(audio/x-wav) \
mimehandler(audio/x-wavpack)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Multimedia.so.5()(64bit) \
libQt5Multimedia.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5WebSockets.so.5()(64bit) \
libQt5WebSockets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libtag.so.1()(64bit)"

inherit rpm
