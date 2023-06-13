SUMMARY = "Deepin Music Player"
DESCRIPTION = "Deepin Music Player is a music player backed by gstreamer, with \
customizable UI, and featuring music search by Pinyin and Quanpin. It \
supports colorful lyrics, online audio support and a 'mini mode'."
LICENSE = "GPL-3.0-or-later"

PV = "6.2.18"

RPM_NAME = "deepin-music-player-6.2.18-1.6.aarch64.rpm"
RPM_HASH = "d6422d41287301932ee763ebdf56ea2a4f24b81d985c4d9d4cac2f845ed11134232fc8e5fe9f3628a00b8512e05c070ff7bd80274f88224892c8734161116823"

RPROVIDES:${PN} += "application() \
application(deepin-music.desktop) \
deepin-music \
deepin-music-player \
deepin-music-player(aarch-64) \
mimehandler(application/aac) \
mimehandler(application/musepack) \
mimehandler(application/ogg) \
mimehandler(application/x-ape) \
mimehandler(application/x-flac) \
mimehandler(application/x-id3) \
mimehandler(application/x-ms-wma) \
mimehandler(application/x-musepack) \
mimehandler(application/x-ogg) \
mimehandler(application/x-wav) \
mimehandler(audio/3gp) \
mimehandler(audio/AMR) \
mimehandler(audio/aac) \
mimehandler(audio/ac3) \
mimehandler(audio/ape) \
mimehandler(audio/flac) \
mimehandler(audio/imy) \
mimehandler(audio/midi) \
mimehandler(audio/mp) \
mimehandler(audio/mp3) \
mimehandler(audio/mpc) \
mimehandler(audio/mpeg) \
mimehandler(audio/mpeg3) \
mimehandler(audio/musepack) \
mimehandler(audio/ogg) \
mimehandler(audio/vorbis) \
mimehandler(audio/x-ape) \
mimehandler(audio/x-flac) \
mimehandler(audio/x-m4a) \
mimehandler(audio/x-mp) \
mimehandler(audio/x-mp3) \
mimehandler(audio/x-mpc) \
mimehandler(audio/x-mpeg) \
mimehandler(audio/x-mpeg-3) \
mimehandler(audio/x-ms-wma) \
mimehandler(audio/x-musepack) \
mimehandler(audio/x-ogg) \
mimehandler(audio/x-vorbis) \
mimehandler(audio/x-wav) \
mimehandler(audio/xmf)"

RDEPENDS:${PN} += "libKF5Codecs.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Multimedia.so.5()(64bit) \
libQt5Multimedia.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libdtkcore.so.5()(64bit) \
libdtkgui.so.5()(64bit) \
libdtkwidget.so.5()(64bit) \
libgcc_s.so.1()(64bit) \
libicui18n.so.73()(64bit) \
libmpris-qt5.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libtag.so.1()(64bit) \
libudisks2-qt5.so.0()(64bit) \
qt5integration \
vlc"

inherit rpm
