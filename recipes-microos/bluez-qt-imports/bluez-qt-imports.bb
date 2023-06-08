SUMMARY = "Async Bluez wrapper library"
DESCRIPTION = "Async Bluez wrapper library. \
QML imports."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "bluez-qt-imports-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "b017ce9b425f80a698c9ac7fd67851b377ca9ce55a136894e8bd3e7a5d247f0f8dd4873f0dbf8a57159619ba255ddde4100e79a18bade1d607ba5eb62ca0e2b7"

RPROVIDES:${PN} += "bluez-qt-imports bluez-qt-imports(aarch-64) libbluezqtextensionplugin.so()(64bit) qt5qmlimport(org.kde.bluezqt.1)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5BluezQt.so.6()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQtQuick5 libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) qt5qmlimport(org.kde.bluezqt.1)"

inherit rpm
