SUMMARY = "Qt 6 Pdf QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Pdf module"
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-pdf-imports-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "fa2883d66b4f6ae42503fafa7b3900d0ac82091146915ce3c010abe88f09b04041b6cafc1d17457f9477c3a881c523b28cf9d633857a22ca5d210ee9d86d24ef"

RPROVIDES:${PN} += "libpdfquickplugin.so \
qt6-pdf-imports \
qt6qmlimport-QtQuick.Pdf.5 \
qt6qmlimport-QtQuick.Pdf.6"

RDEPENDS:${PN} += "libQt6Core.so.6 \
libQt6PdfQuick.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
