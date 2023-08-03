SUMMARY = "Qt 6 OpcUa QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 OpcUa module."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-opcua-imports-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "6c1f881a7bc4c7f4da769e39c9f561518532539dc0684f5f3624301fb772e1d2a9caf06c8b148c3b345d51f01c69fc677a0372575aff0f59444e42cf6179273f"

RPROVIDES:${PN} += "libdeclarativeopcuaplugin.so \
qt6-opcua-imports \
qt6qmlimport-QtOpcUa.1 \
qt6qmlimport-QtOpcUa.5 \
qt6qmlimport-QtOpcUa.6"

RDEPENDS:${PN} += "libQt6Core.so.6 \
libQt6DeclarativeOpcua.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6-opcua"

inherit rpm
