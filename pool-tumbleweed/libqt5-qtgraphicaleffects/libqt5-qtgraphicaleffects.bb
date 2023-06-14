SUMMARY = "Qt 5 Graphical Effects"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package contains base tools, like string, xml, and network \
handling."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtgraphicaleffects-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "0bb43f64ab7e4f9b2d39346f2c8061fe32e013d13156b04fecd6601057ce9837c12b7862657868b73d891e224c8810c6e2a418eb36bc070c58e7405d60022854"

RPROVIDES:${PN} += "libqt5-qtgraphicaleffects \
libqtgraphicaleffectsplugin.so \
libqtgraphicaleffectsprivate.so \
qt5qmlimport-QtGraphicalEffects.1 \
qt5qmlimport-QtGraphicalEffects.private.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQtQuick5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
qt5qmlimport-QtGraphicalEffects.1 \
qt5qmlimport-QtGraphicalEffects.private.1 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Window.2"

inherit rpm
