SUMMARY = "SONOS device controller"
DESCRIPTION = "A controller for SONOS devices. It allows for browsing the music \
library, and playing tracks or radio on any zones. Zone groups, \
queues and playlists can be managed, and playback be controlled."
LICENSE = "GPL-3.0-or-later"

PV = "5.4.0"

RPM_NAME = "noson-app-5.4.0-1.4.aarch64.rpm"
RPM_HASH = "2db6b5c4e69210448a5a78c93f9c805123b300ec8addcee87d9ebe34c9e08609dbb348f58ecb07da7f0805a44d7ab4f722643d1186f19721a14856e5b265cae3"

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
