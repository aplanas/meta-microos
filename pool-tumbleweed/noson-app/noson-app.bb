SUMMARY = "SONOS device controller"
DESCRIPTION = "A controller for SONOS devices. It allows for browsing the music \
library, and playing tracks or radio on any zones. Zone groups, \
queues and playlists can be managed, and playback be controlled."
LICENSE = "GPL-3.0-or-later"

PV = "5.4.0"

RPM_NAME = "noson-app-5.4.0-1.3.aarch64.rpm"
RPM_HASH = "0916aad35e0ab7a0069fc20fa701fb81e52a85341a4aadd641fe5972c79533752c420f162eb8c1e0acf0ef98f9a7d26ecf8e4c544dbf0e723c5c2a6a52e47e08"

RPROVIDES:${PN} += "application() \
application(io.github.janbar.noson.desktop) \
libNosonApp.so()(64bit) \
libNosonMediaScanner.so()(64bit) \
libNosonThumbnailer.so()(64bit) \
metainfo() \
metainfo(io.github.janbar.noson.appdata.xml) \
noson-app \
noson-app(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5QuickControls2.so.5()(64bit) \
libQt5QuickControls2.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libnoson.so.2()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
