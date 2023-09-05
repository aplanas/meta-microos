SUMMARY = "Music player and collection organizer"
DESCRIPTION = "Elisa is a music player with a library where music can be browsed by \
album, artist or all tracks. It is indexed using either a private \
indexer or an indexer using Baloo. The private one can be configured \
to scan music on chosen paths. The Baloo one is faster because Baloo \
is providing all needed data from its own database. Playlists can be \
built and played."
LICENSE = "LGPL-3.0-or-later"

PV = "23.08.0"

RPM_NAME = "elisa-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "b8f806ef8e1dcffebe26ca44b988929e38883a28505a5da70e7a60ea00edba6c9ba6d7b0c055c93a2b38daa96cbfba7a4c4b26f12c533ada537153a607ea8154"

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
