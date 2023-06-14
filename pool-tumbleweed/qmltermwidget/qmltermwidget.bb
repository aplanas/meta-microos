SUMMARY = "QML port of qtermwidget"
DESCRIPTION = "This project provides a Unicode-enabled, embeddable QML widget for \
using as a built-in console (or terminal emulation widget)."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0"

RPM_NAME = "qmltermwidget-0.2.0-2.16.aarch64.rpm"
RPM_HASH = "4f2e8341b7601c5b8bb8260a8dcaedab61c5acaf0e16d626fe67598389442913cfae0fd543b783e81d2fdd33223a2d7f18be1177a47ad4f87c66631739b19cd4"

RPROVIDES:${PN} += "libqmltermwidget.so \
qmltermwidget \
qt5qmlimport-QMLTermWidget.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
qt5qmlimport-QMLTermWidget.1 \
qt5qmlimport-QtQuick.2"

inherit rpm
