SUMMARY = "Barcode abstraction layer library - QML files"
DESCRIPTION = "Prison is a barcode abstraction layer library providing \
uniform access to generation of barcodes with data. This package contains \
files that allow use of libprison with QtQuick based applications."
LICENSE = "MIT"

PV = "5.106.0"

RPM_NAME = "prison-qt5-imports-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "88c9789886924fa5c230c71ff2ce7ba33e895c797ba24d13f0e9f6d78feab067ee2425e6cef93daea3cf7929370bff25eaaa089268e20ecc505d5173273b4ce3"

RPROVIDES:${PN} += "libprisonquickplugin.so()(64bit) \
libprisonscannerquickplugin.so()(64bit) \
prison-qt5-imports \
prison-qt5-imports(aarch-64) \
qt5qmlimport(org.kde.prison.1) \
qt5qmlimport(org.kde.prison.scanner.1)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5Prison.so.5()(64bit) \
libKF5Prison5 \
libKF5PrisonScanner.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
