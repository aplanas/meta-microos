SUMMARY = "QML port of qtermwidget"
DESCRIPTION = "This project provides a Unicode-enabled, embeddable QML widget for \
using as a built-in console (or terminal emulation widget)."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0"

RPM_NAME = "qmltermwidget-0.2.0-2.17.aarch64.rpm"
RPM_HASH = "d0ad7cd13484992e2fe718161d40c5bdf59607383b9bcb6c331c793bdcdcb690bba58b9e9f2dcc69cc17852f73b14cfde45401e08a4fe7cc6e7d1f2e5f65fae4"

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
