SUMMARY = "SONOS device controller"
DESCRIPTION = "A controller for SONOS devices. It allows for browsing the music \
library, and playing tracks or radio on any zones. Zone groups, \
queues and playlists can be managed, and playback be controlled."
LICENSE = "GPL-3.0-or-later"

PV = "5.4.0"

RPM_NAME = "noson-app-5.4.0-1.3.aarch64.rpm"
RPM_HASH = "0916aad35e0ab7a0069fc20fa701fb81e52a85341a4aadd641fe5972c79533752c420f162eb8c1e0acf0ef98f9a7d26ecf8e4c544dbf0e723c5c2a6a52e47e08"

RPROVIDES:${PN} += "libNosonApp.so \
libNosonMediaScanner.so \
libNosonThumbnailer.so \
noson-app"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickControls2.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libnoson.so.2 \
libstdc++.so.6"

inherit rpm
