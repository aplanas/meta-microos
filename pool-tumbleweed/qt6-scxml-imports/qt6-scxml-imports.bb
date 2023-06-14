SUMMARY = "Qt 6 Scxml QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Scxml module"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-scxml-imports-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "958ea80b93023fdf7c35a081450cf4d25dd6b1ba6bda5d899baee68d59f6f07cf92986cc4689f134cb391def11a22ef30bd5550b798ede6075bcfa8c8ce5a7ad"

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
