SUMMARY = "Qt5 bindings for the Telepathy Library"
DESCRIPTION = "Service library for the Qt5 telepathy binding."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.8"

RPM_NAME = "libtelepathy-qt5-service1-0.9.8-1.16.aarch64.rpm"
RPM_HASH = "35368fc63caf8caf9f10d3cffdecbc46d6db6baffdca7bc4d0e424aefb94fa375d0e905afae14de35a44fcbc885a06c9da43ed21ca6acb7c0dc98481d48a4c84"

RPROVIDES:${PN} += "libtelepathy-qt5-service.so.1 \
libtelepathy-qt5-service1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtelepathy-qt5.so.0"

inherit rpm
