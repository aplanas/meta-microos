SUMMARY = "QML components for Baloo Framework"
DESCRIPTION = "Baloo is a framework for searching and managing metadata. This \
package contains QML imports."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.109.0"

RPM_NAME = "baloo5-imports-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "bcff039beae7d05e6762ae9f066a6998224093a0bfaa96cd9ebc1dd332908b39908fe8b527fa3f24ee2acb3a8b6e0b4b1abfc94ba8509b3657c9573cc9221f37"

RPROVIDES:${PN} += "baloo5-imports \
libbaloomonitorplugin.so \
libbalooplugin.so \
qt5qmlimport-org.kde.baloo.0 \
qt5qmlimport-org.kde.baloo.experimental.0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Baloo.so.5 \
libKF5BalooEngine.so.5 \
libKF5CoreAddons.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Qml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
