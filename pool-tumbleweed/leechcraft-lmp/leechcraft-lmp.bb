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

RPM_NAME = "leechcraft-lmp-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "eefd84f9ee69e32c4b59aa30b34e8a401661b841d16fb05076550474dee23ff5e8cef9478c01efdafd99122c3e110968751bf451f59576af088d8d186f57f5ab"

RPROVIDES:${PN} += "leechcraft-audioplayer \
leechcraft-lmp \
leechcraft-soundnotifications \
libleechcraft-lmp.so"

RDEPENDS:${PN} += "gstreamer-plugins-base \
gstreamer-plugins-good \
ld-linux-aarch64.so.1 \
leechcraft \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5QuickWidgets.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libguess.so.1 \
libleechcraft-util-db-qt5.so.0.6.75.1 \
libleechcraft-util-gui-qt5.so.0.6.75.1 \
libleechcraft-util-models-qt5.so.0.6.75.1 \
libleechcraft-util-qml-qt5.so.0.6.75.2 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libleechcraft-util-xsd-qt5.so.0.6.75 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libm.so.6 \
libqt5-qtgraphicaleffects \
libqt5-qtquickcontrols \
libstdc++.so.6 \
libtag.so.1 \
qt5qmlimport-QtGraphicalEffects.1 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Controls.Styles.1 \
qt5qmlimport-QtQuick.Layouts.1"

inherit rpm
