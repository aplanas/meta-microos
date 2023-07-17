SUMMARY = "Qt 6 OpcUa QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 OpcUa module."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-opcua-imports-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "61d5f4c5e96bc318571f896debd58f6769f14f545a09ac97e94c9e8f68180a7622925cd28e0294b72fadfe8ccbd83b67412f4ed7a040d17d7742a830e3284d16"

RPROVIDES:${PN} += "libdeclarativeopcuaplugin.so \
qt6-opcua-imports"

RDEPENDS:${PN} += "libQt6Core.so.6 \
libQt6DeclarativeOpcua.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6-opcua"

inherit rpm
