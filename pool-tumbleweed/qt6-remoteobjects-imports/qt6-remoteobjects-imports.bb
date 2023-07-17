SUMMARY = "Qt 6 RemoteObjects QML files"
DESCRIPTION = "QML files and plugins for the Qt 6 RemoteObjects module"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-remoteobjects-imports-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "3dc9065c7cf38630dc6a50c96578c9ce06d6767f93dcdc6c247d98adb8d679a6c677952504f49ded796e62d670d8d825b4e04beabfe7378e5fe3e223bf72094d"

RPROVIDES:${PN} += "libdeclarative-remoteobjectsplugin.so \
qt6-remoteobjects-imports"

RDEPENDS:${PN} += "libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6RemoteObjectsQml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
