SUMMARY = "Qt 6 Charts QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Charts module."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-charts-imports-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "f2bf1e9f9c7c1b8cb670f43094d6d413978cc3ede88c74c8da514c62d8eb4638b85c0384fd9b9997e28ba8a6a049cee3e8b1a0a2eac5c9ace888dd93f7ec8951"

RPROVIDES:${PN} += "libqtchartsqml2plugin.so()(64bit) \
libqtchartsqml2plugin.so(Qt_6)(64bit) \
qt6-charts-imports \
qt6-charts-imports(aarch-64)"

RDEPENDS:${PN} += "libQt6ChartsQml.so.6()(64bit) \
libQt6ChartsQml.so.6(Qt_6)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
