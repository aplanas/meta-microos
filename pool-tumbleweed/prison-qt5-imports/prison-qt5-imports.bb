SUMMARY = "Barcode abstraction layer library - QML files"
DESCRIPTION = "Prison is a barcode abstraction layer library providing \
uniform access to generation of barcodes with data. This package contains \
files that allow use of libprison with QtQuick based applications."
LICENSE = "MIT"

PV = "5.106.0"

RPM_NAME = "prison-qt5-imports-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "88c9789886924fa5c230c71ff2ce7ba33e895c797ba24d13f0e9f6d78feab067ee2425e6cef93daea3cf7929370bff25eaaa089268e20ecc505d5173273b4ce3"

RPROVIDES:${PN} += "libprisonquickplugin.so \
libprisonscannerquickplugin.so \
prison-qt5-imports \
qt5qmlimport-org.kde.prison.1 \
qt5qmlimport-org.kde.prison.scanner.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Prison.so.5 \
libKF5Prison5 \
libKF5PrisonScanner.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
