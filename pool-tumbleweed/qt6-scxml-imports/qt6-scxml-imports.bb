SUMMARY = "Qt 6 Scxml QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Scxml module"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-scxml-imports-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "5ea33555695b672b2a6eefb0c85fb2376230676d0046897b3b9b4ef2b192b69e6b6a757e04f37e2de301a0d17ff916d92cd729a9ae27f7d29db47d54c481ba9a"

RPROVIDES:${PN} += "libdeclarative-scxmlplugin.so \
libqtqmlstatemachineplugin.so \
qt6-scxml-imports \
qt6qmlimport-QtQml.StateMachine.1 \
qt6qmlimport-QtQml.StateMachine.6 \
qt6qmlimport-QtScxml.5 \
qt6qmlimport-QtScxml.6"

RDEPENDS:${PN} += "libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6ScxmlQml.so.6 \
libQt6StateMachineQml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
