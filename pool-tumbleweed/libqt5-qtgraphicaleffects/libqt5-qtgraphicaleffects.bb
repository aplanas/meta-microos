SUMMARY = "Qt 5 Graphical Effects"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package contains base tools, like string, xml, and network \
handling."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtgraphicaleffects-5.15.10+kde0-2.1.aarch64.rpm"
RPM_HASH = "32a8c7102d182b153c7e3b653b1874d462585aac38d20c36362862decc7ebfd688dba8779a50e423a2ca8111c415538164e1db1556dddde02fe8964033490725"

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
