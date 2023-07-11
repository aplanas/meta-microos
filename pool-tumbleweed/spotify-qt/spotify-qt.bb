SUMMARY = "Lightweight Spotify client using Qt"
DESCRIPTION = "An unofficial Spotify client using Qt as a simpler, lighter alternative to the official client, inspired by spotify-tui. Much like spotify-tui, you need an actual Spotify client running, for example spotifyd, which can be configured from within the app. Also like other clients, controlling music playback requires Spotify Premium."
LICENSE = "GPL-3.0-only"

PV = "3.10"

RPM_NAME = "spotify-qt-3.10-1.2.aarch64.rpm"
RPM_HASH = "5e9e392b71657e5adbd700c5dbac06b4c4fae33e01e7b255101dde1f17661e0fbfdcc84850822dba8cef6e3a33644cd0e96d664d68f615b1445a03ad1a2a9cb9"

RPROVIDES:${PN} += "spotify-qt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
