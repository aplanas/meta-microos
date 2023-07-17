SUMMARY = "QML components for Baloo Framework"
DESCRIPTION = "Baloo is a framework for searching and managing metadata. This \
package contains QML imports."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.108.0"

RPM_NAME = "baloo5-imports-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "ea2f27e504e15c2c10bcec57127b90ef8baf2038288921e6ff177332fd06a8b92f5db54fafeece6852e574bceecde1061ba177dad4e7aaf59bce7396109a4ce6"

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
