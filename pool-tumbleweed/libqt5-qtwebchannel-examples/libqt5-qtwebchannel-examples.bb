SUMMARY = "Qt5 WebChannel examples"
DESCRIPTION = "Examples for the libqt5-qtwebchannel module."
LICENSE = "BSD-3-Clause"

PV = "5.15.10+kde3"

RPM_NAME = "libqt5-qtwebchannel-examples-5.15.10+kde3-1.1.aarch64.rpm"
RPM_HASH = "51499fbe51b578e14d722f51453b095836c985ba7684783e34bbfe36e5abe63f2c9f6b8b99b248daf33c56c50a2097732d18b43a804250a28535d6238afc5db4"

RPROVIDES:${PN} += "libqt5-qtwebchannel-examples"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5WebChannel.so.5 \
libQt5WebSockets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-Qt.WebSockets.1 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Dialogs.1 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Window.2"

inherit rpm
