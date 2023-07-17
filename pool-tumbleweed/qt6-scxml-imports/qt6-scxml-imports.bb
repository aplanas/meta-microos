SUMMARY = "Qt 6 Scxml QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Scxml module"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-scxml-imports-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "c69e54352d12b03fa0f038ffc6a42da07326b81fe2cc7e7d6281c93c0ba761c3aef0bdd346f35315c7cbe64b804ecd2b0f417fe9fc112ec111f0557bcc7ca0c3"

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
