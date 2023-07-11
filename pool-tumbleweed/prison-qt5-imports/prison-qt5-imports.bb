SUMMARY = "Barcode abstraction layer library - QML files"
DESCRIPTION = "Prison is a barcode abstraction layer library providing \
uniform access to generation of barcodes with data. This package contains \
files that allow use of libprison with QtQuick based applications."
LICENSE = "MIT"

PV = "5.107.0"

RPM_NAME = "prison-qt5-imports-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "0b6c98e9e551fcb7ba0a0a170628eca9a6969a17ab0811eca13488a399ac5e43be10ba4043eccddbd85808a5bf5903af9828797529cbd81947f56f4309a268ce"

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
