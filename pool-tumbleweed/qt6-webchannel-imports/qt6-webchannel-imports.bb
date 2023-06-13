SUMMARY = "Qt 6 WebChannel QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 WebChannel module"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-webchannel-imports-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "e035c37adfa2b26141ba01c1c6db0b57164a9ff5077be5e83185bb115a99d9c31ffabeb0d30b40904f77822b2144f92bb3e59ef2cf01373a55d0bb87c9a95c81"

RPROVIDES:${PN} += "libwebchannelplugin.so()(64bit) \
libwebchannelplugin.so(Qt_6)(64bit) \
qt6-webchannel-imports \
qt6-webchannel-imports(aarch-64) \
qt6qmlimport(QtWebChannel.1)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6WebChannel.so.6()(64bit) \
libQt6WebChannel.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
