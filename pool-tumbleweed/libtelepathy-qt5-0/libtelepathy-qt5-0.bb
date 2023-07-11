SUMMARY = "Qt5 bindings for the Telepathy Library"
DESCRIPTION = "Telepathy-Qt5 is a high-level binding for Telepathy, similar to telepathy-glib but for Qt 5."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.8"

RPM_NAME = "libtelepathy-qt5-0-0.9.8-1.16.aarch64.rpm"
RPM_HASH = "b1684419fb93fd4ed2ac82bbd44ab3073a2e1983350945c89cc9b62e7f2ec78a73000dff69dd3220fb538de1b0223dc001a0ce5f304deb6374176c8bb29c9ccc"

RPROVIDES:${PN} += "libtelepathy-qt5-0 \
libtelepathy-qt5.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Network.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
