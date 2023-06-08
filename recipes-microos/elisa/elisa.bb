SUMMARY = "Music player and collection organizer"
DESCRIPTION = "Elisa is a music player with a library where music can be browsed by \
album, artist or all tracks. It is indexed using either a private \
indexer or an indexer using Baloo. The private one can be configured \
to scan music on chosen paths. The Baloo one is faster because Baloo \
is providing all needed data from its own database. Playlists can be \
built and played."
LICENSE = "LGPL-3.0-or-later"

PV = "23.04.0"

RPM_NAME = "elisa-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "bdedf48549d79c37ef37b9174e9c542df5882669df2de1316e8111570216f45800a0cae711b242f6edb6c5b1c1c232cc5493fdf0cc97a71507f1648c20055d90"

RPROVIDES:${PN} += "application() application(org.kde.elisa.desktop) elisa elisa(aarch-64) libelisaLib.so.0()(64bit) libelisaqmlplugin.so()(64bit) metainfo() metainfo(org.kde.elisa.appdata.xml) mimehandler(application/x-ogm-audio) mimehandler(audio/aac) mimehandler(audio/mp4) mimehandler(audio/mpeg) mimehandler(audio/mpegurl) mimehandler(audio/ogg) mimehandler(audio/vnd.rn-realaudio) mimehandler(audio/vorbis) mimehandler(audio/x-flac) mimehandler(audio/x-mp3) mimehandler(audio/x-mpegurl) mimehandler(audio/x-ms-wma) mimehandler(audio/x-musepack) mimehandler(audio/x-oggflac) mimehandler(audio/x-pn-realaudio) mimehandler(audio/x-scpls) mimehandler(audio/x-speex) mimehandler(audio/x-vorbis) mimehandler(audio/x-vorbis+ogg) mimehandler(audio/x-wav)"
RDEPENDS:${PN} += "kdeclarative-components kirigami2 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Baloo.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5FileMetaData.so.3()(64bit) libKF5I18n.so.5()(64bit) libKF5IconThemes.so.5()(64bit) libKF5ItemViews.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOFileWidgets.so.5()(64bit) libKF5KIOGui.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Multimedia.so.5()(64bit) libQt5Multimedia.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5QuickControls2.so.5()(64bit) libQt5QuickControls2.so.5(Qt_5)(64bit) libQt5Sql.so.5()(64bit) libQt5Sql.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libqt5-qtquickcontrols libqt5-qtquickcontrols2 libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
