SUMMARY = "Music player and collection organizer"
DESCRIPTION = "Elisa is a music player with a library where music can be browsed by \
album, artist or all tracks. It is indexed using either a private \
indexer or an indexer using Baloo. The private one can be configured \
to scan music on chosen paths. The Baloo one is faster because Baloo \
is providing all needed data from its own database. Playlists can be \
built and played."
LICENSE = "LGPL-3.0-or-later"

PV = "23.04.3"

RPM_NAME = "elisa-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "a34b583e96cc10045e928457e791871a65e6fead508b108c4adf3115e5e5e012713afac01d2e742dfb19945f68fe434253fae621f87202bb3c0c79d44a233e7a"

RPROVIDES:${PN} += "elisa \
libelisaLib.so.0 \
libelisaqmlplugin.so"

RDEPENDS:${PN} += "kdeclarative-components \
kirigami2 \
ld-linux-aarch64.so.1 \
libKF5Baloo.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5FileMetaData.so.3 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5ItemViews.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickControls2.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libqt5-qtquickcontrols \
libqt5-qtquickcontrols2 \
libstdc++.so.6"

inherit rpm
