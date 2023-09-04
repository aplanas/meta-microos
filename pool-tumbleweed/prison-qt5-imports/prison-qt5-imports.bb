SUMMARY = "Barcode abstraction layer library - QML files"
DESCRIPTION = "Prison is a barcode abstraction layer library providing \
uniform access to generation of barcodes with data. This package contains \
files that allow use of libprison with QtQuick based applications."
LICENSE = "MIT"

PV = "5.109.0"

RPM_NAME = "prison-qt5-imports-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "43a95de106214057ffbcff2165a60a3d41d0ffb73b789c69699161a82805e002a9adc6782486f32b4a6ff987dbf7b1f9aba7752270f8c4b5ef4acce1d9892251"

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
