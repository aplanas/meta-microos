SUMMARY = "QML components for Baloo Framework"
DESCRIPTION = "Baloo is a framework for searching and managing metadata. This \
package contains QML imports."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.106.0"

RPM_NAME = "baloo5-imports-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "d3e0882926de6a56b67f5b42b2697cb2a65efab5732b6833379fff8cfb938237a72a3aa05b84b909a6d109d79657067852fcc0a4618459bf236e01f40ee3fb41"

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
