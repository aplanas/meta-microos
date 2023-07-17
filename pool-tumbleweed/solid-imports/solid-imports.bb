SUMMARY = "KDE Desktop hardware abstraction"
DESCRIPTION = "Solid is a device integration framework.  It provides a way of querying and \
interacting with hardware independently of the underlying operating system. \
QML imports."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "solid-imports-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "bf1c05c1a6c702aa6621ebe1acda0c2d97d35d8fc11763066ff5e8bff91d22b6e1397f2c6576553142724a05860746724cf93bc8b86f62bcddfe9891a458350e"

RPROVIDES:${PN} += "libsolidextensionplugin.so \
qt5qmlimport-org.kde.solid.1 \
solid-imports"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Solid.so.5 \
libQt5Core.so.5 \
libQt5Qml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
