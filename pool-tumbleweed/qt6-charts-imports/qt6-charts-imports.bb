SUMMARY = "Qt 6 Charts QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Charts module."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-charts-imports-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "27e2e962057b8955533364e92ab2fd2d130d8b976c9b48312ff51a3ad356afc860e7fe86487c3508e4efc4a8daccb289efa5bc5bcf6bb1be22c69b1d82847979"

RPROVIDES:${PN} += "libqtchartsqml2plugin.so \
qt6-charts-imports"

RDEPENDS:${PN} += "libQt6ChartsQml.so.6 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
