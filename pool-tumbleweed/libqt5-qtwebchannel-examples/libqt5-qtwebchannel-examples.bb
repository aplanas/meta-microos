SUMMARY = "Qt5 WebChannel examples"
DESCRIPTION = "Examples for the libqt5-qtwebchannel module."
LICENSE = "BSD-3-Clause"

PV = "5.15.9+kde3"

RPM_NAME = "libqt5-qtwebchannel-examples-5.15.9+kde3-1.1.aarch64.rpm"
RPM_HASH = "101b9b235ed91c983b35a6c0e8460b1a328d5669918f1772724ee29b037b9c507415319319944fd8782e4ba0cb6cddf809ed435053476ebc12e8d6f218bee809"

RPROVIDES:${PN} += "libqt5-qtwebchannel-examples \
libqt5-qtwebchannel-examples(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5WebChannel.so.5()(64bit) \
libQt5WebChannel.so.5(Qt_5)(64bit) \
libQt5WebSockets.so.5()(64bit) \
libQt5WebSockets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit) \
qt5qmlimport(Qt.WebSockets.1) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.2) \
qt5qmlimport(QtQuick.Dialogs.1) \
qt5qmlimport(QtQuick.Layouts.1) \
qt5qmlimport(QtQuick.Window.2)"

inherit rpm
