SUMMARY = "Deepin Music Player"
DESCRIPTION = "Deepin Music Player is a music player backed by gstreamer, with \
customizable UI, and featuring music search by Pinyin and Quanpin. It \
supports colorful lyrics, online audio support and a 'mini mode'."
LICENSE = "GPL-3.0-or-later"

PV = "6.2.18"

RPM_NAME = "deepin-music-player-6.2.18-1.6.aarch64.rpm"
RPM_HASH = "d6422d41287301932ee763ebdf56ea2a4f24b81d985c4d9d4cac2f845ed11134232fc8e5fe9f3628a00b8512e05c070ff7bd80274f88224892c8734161116823"

RPROVIDES:${PN} += "deepin-music \
deepin-music-player"

RDEPENDS:${PN} += "libKF5Codecs.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libdtkcore.so.5 \
libdtkgui.so.5 \
libdtkwidget.so.5 \
libgcc-s.so.1 \
libicui18n.so.73 \
libmpris-qt5.so.1 \
libstdc++.so.6 \
libtag.so.1 \
libudisks2-qt5.so.0 \
qt5integration \
vlc"

inherit rpm
