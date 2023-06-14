SUMMARY = "Qt5 bindings for the Telepathy Library"
DESCRIPTION = "Telepathy-Qt5 is a high-level binding for Telepathy, similar to telepathy-glib but for Qt 5."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.8"

RPM_NAME = "libtelepathy-qt5-0-0.9.8-1.15.aarch64.rpm"
RPM_HASH = "de5eb07f928a77a0680089e7ce103cbdc7de161dd413feef91455c1a15e16a9a54f9bdb05c1abf98bf80dd4b922115003867f0cecc22c4376c3f2e35fe1b1d48"

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
