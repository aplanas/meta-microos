SUMMARY = "LeechCraft Media player Module"
DESCRIPTION = "This package provides an audio player plugin for LeechCraft. \
It uses Gstreamer as a backend, thus supporting major codecs. \
 \
Features: \
 * Streaming media over Internet. \
 * Play queue. \
 * Support for automatic podcast playing (with a plugin like Aggregator)."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-lmp-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "e16425608f5f55b2bb2c618431ff944895d3dcb9c126fb9c669e258541c7bddae80b7061afdc6a6b5f93733dfcd18e2115ff98bdc76c23c901aa215f1f54141d"

RPROVIDES:${PN} += "application() \
application(leechcraft-lmp-qt5.desktop) \
leechcraft-audioplayer \
leechcraft-lmp \
leechcraft-lmp(aarch-64) \
leechcraft-soundnotifications \
libleechcraft_lmp.so()(64bit) \
mimehandler(application/ogg) \
mimehandler(application/x-cue) \
mimehandler(application/x-ogg) \
mimehandler(audio/flac) \
mimehandler(audio/mp3) \
mimehandler(audio/mpeg) \
mimehandler(audio/x-ape) \
mimehandler(audio/x-ffmpeg-shorten) \
mimehandler(audio/x-it) \
mimehandler(audio/x-mod) \
mimehandler(audio/x-mp3) \
mimehandler(audio/x-mpeg) \
mimehandler(audio/x-mpegurl) \
mimehandler(audio/x-ms-wma) \
mimehandler(audio/x-musepack) \
mimehandler(audio/x-scpls) \
mimehandler(audio/x-vorbis+ogg) \
mimehandler(inode/directory)"

RDEPENDS:${PN} += "gstreamer-plugins-base \
gstreamer-plugins-good \
ld-linux-aarch64.so.1()(64bit) \
leechcraft \
libQt5Concurrent.so.5()(64bit) \
libQt5Concurrent.so.5(Qt_5)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5QuickWidgets.so.5()(64bit) \
libQt5QuickWidgets.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libguess.so.1()(64bit) \
libleechcraft-util-db-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-gui-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-models-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-qml-qt5.so.0.6.75.2()(64bit) \
libleechcraft-util-qt5.so.0.6.75()(64bit) \
libleechcraft-util-sll-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-sys-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-xpc-qt5.so.0.6.75.2()(64bit) \
libleechcraft-util-xsd-qt5.so.0.6.75()(64bit) \
libleechcraft-xsd-qt5.so.0.6.75.2()(64bit) \
libm.so.6()(64bit) \
libqt5-qtgraphicaleffects \
libqt5-qtquickcontrols \
libstdc++.so.6()(64bit) \
libtag.so.1()(64bit) \
qt5qmlimport(QtGraphicalEffects.1) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.1) \
qt5qmlimport(QtQuick.Controls.Styles.1) \
qt5qmlimport(QtQuick.Layouts.1)"

inherit rpm
