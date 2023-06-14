SUMMARY = "KDE Desktop hardware abstraction"
DESCRIPTION = "Solid is a device integration framework.  It provides a way of querying and \
interacting with hardware independently of the underlying operating system. \
QML imports."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "solid-imports-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "5530ccfee819edb420541e991042d9bba3c3e84249a64b88063f3ecdc51dc7aeabbfb5f55cfc7ed7bbc6045feeab55f973783937773f3121c7132ae249a9a8f1"

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
