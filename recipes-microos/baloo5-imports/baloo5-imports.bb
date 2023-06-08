SUMMARY = "QML components for Baloo Framework"
DESCRIPTION = "Baloo is a framework for searching and managing metadata. This \
package contains QML imports."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.105.0"

RPM_NAME = "baloo5-imports-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "987b2f230f27bb5ddf3fa0c35e0395b273e14daa88347ccc1f266410e20a3c7edc1e38d0b166a22c5eeabdbb5e9b3098e959f55841c599c4002982d716efb63d"

RPROVIDES:${PN} += "baloo5-imports baloo5-imports(aarch-64) libbaloomonitorplugin.so()(64bit) libbalooplugin.so()(64bit) qt5qmlimport(org.kde.baloo.0) qt5qmlimport(org.kde.baloo.experimental.0)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Baloo.so.5()(64bit) libKF5BalooEngine.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
