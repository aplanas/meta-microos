SUMMARY = "Qt 6 OpcUa QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 OpcUa module."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-opcua-imports-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "3927e7222fcae18bd9b4a9aae93d10bf0f2ff5e823c0bc96fb393048e1d7ece3efd8b31538d69abea1750661d1a7e0a23dd22fd47b916b21a0c68560d4bb819b"

RPROVIDES:${PN} += "libdeclarativeopcuaplugin.so()(64bit) \
libdeclarativeopcuaplugin.so(Qt_6)(64bit) \
qt6-opcua-imports \
qt6-opcua-imports(aarch-64)"

RDEPENDS:${PN} += "libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6DeclarativeOpcua.so.6()(64bit) \
libQt6DeclarativeOpcua.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit) \
qt6-opcua"

inherit rpm
