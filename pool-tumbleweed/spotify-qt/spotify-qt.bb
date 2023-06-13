SUMMARY = "Lightweight Spotify client using Qt"
DESCRIPTION = "An unofficial Spotify client using Qt as a simpler, lighter alternative to the official client, inspired by spotify-tui. Much like spotify-tui, you need an actual Spotify client running, for example spotifyd, which can be configured from within the app. Also like other clients, controlling music playback requires Spotify Premium."
LICENSE = "GPL-3.0-only"

PV = "3.10"

RPM_NAME = "spotify-qt-3.10-1.1.aarch64.rpm"
RPM_HASH = "fd2944b7ca8731fac68d5222be5fc920eeed6b0a248a0e3dcc0534e1df03fe147e34b9e4d79168bc69ce8a8b585a3b33a65a4e08916d7a9d1bbbac71497ac934"

RPROVIDES:${PN} += "application() \
application(spotify-qt.desktop) \
spotify-qt \
spotify-qt(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
