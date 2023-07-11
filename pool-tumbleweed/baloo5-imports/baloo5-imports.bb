SUMMARY = "QML components for Baloo Framework"
DESCRIPTION = "Baloo is a framework for searching and managing metadata. This \
package contains QML imports."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.107.0"

RPM_NAME = "baloo5-imports-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "0a7c637dc1267441ca3d542a3508d7fd81c2994a0e0ac20fdd76fa449de449cfb9ea69dc0ee8adf18fc9fc73d93d3690e2982ea0cf95dbd0dc6ea26bd819d3b8"

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
