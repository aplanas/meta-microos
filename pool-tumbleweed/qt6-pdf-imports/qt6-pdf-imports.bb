SUMMARY = "Qt 6 Pdf QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Pdf module"
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-pdf-imports-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "8d5a2c3bbf75efcad9005e2e2ed1dc25644a9c1d72867d2287b7e1d6c33a0caa4051184de637e8073e28f1511c2a848c5931a461efacd1814b4dab8088f7d325"

RPROVIDES:${PN} += "libpdfquickplugin.so \
qt6-pdf-imports \
qt6qmlimport-QtQuick.Pdf.2 \
qt6qmlimport-QtQuick.Pdf.5 \
qt6qmlimport-QtQuick.Pdf.6"

RDEPENDS:${PN} += "libQt6Core.so.6 \
libQt6PdfQuick.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
