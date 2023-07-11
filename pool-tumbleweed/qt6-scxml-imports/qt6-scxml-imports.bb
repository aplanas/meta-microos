SUMMARY = "Qt 6 Scxml QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Scxml module"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-scxml-imports-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "a10ae41e4204d230e2b38f0466b20748a0ae54736b2a21d6f2d690f1fedc3ab96115791f6f488822382611772cdddbcb6be4dcfbe3a5913a87c386eb6c58f719"

RPROVIDES:${PN} += "libdeclarative-scxmlplugin.so \
libqtqmlstatemachineplugin.so \
qt6-scxml-imports"

RDEPENDS:${PN} += "libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6ScxmlQml.so.6 \
libQt6StateMachineQml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
