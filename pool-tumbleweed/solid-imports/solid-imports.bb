SUMMARY = "KDE Desktop hardware abstraction"
DESCRIPTION = "Solid is a device integration framework.  It provides a way of querying and \
interacting with hardware independently of the underlying operating system. \
QML imports."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "solid-imports-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "fafd4ee95e36c628a65ac166ff2f34cbe8703e938261aefff3aad895a494678efacc598a457033f1980fd75f12226a2e2789fa725ec6a37fca61b266f23a8153"

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
