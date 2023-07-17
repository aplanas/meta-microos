SUMMARY = "Barcode abstraction layer library - QML files"
DESCRIPTION = "Prison is a barcode abstraction layer library providing \
uniform access to generation of barcodes with data. This package contains \
files that allow use of libprison with QtQuick based applications."
LICENSE = "MIT"

PV = "5.108.0"

RPM_NAME = "prison-qt5-imports-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "ff99b64c08287531c4782d60333bac0a641cb108d39c990bf5c99496ccfccd1e76b4151af70869f15bda88917b94c6326aa7d76f8359cd4da590bd0deffd9cb1"

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
