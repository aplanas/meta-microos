SUMMARY = "Qt 6 Pdf QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Pdf module"
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-pdf-imports-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "819d37d504d67ba6dbb2e99c6fa0161104454d33dfaca6852e31067a2ac276f9a86c7078a21ff8677017cf380c978f505bb45bf4206e88e84e6b5b505ad8f580"

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
