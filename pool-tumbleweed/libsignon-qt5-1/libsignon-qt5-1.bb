SUMMARY = "Single Sign On Framework for Qt"
DESCRIPTION = "Framework that provides credential storage and authentication service."
LICENSE = "LGPL-2.0-only"

PV = "8.61"

RPM_NAME = "libsignon-qt5-1-8.61-1.1.aarch64.rpm"
RPM_HASH = "03bc621619c40779a414e5a0535fd422369d5a352cc9c845b41cd9364b20691fba174c1b99e441e014c87015e573119bd0e41096e4665c14efec0d9c9f5f3a7b"

RPROVIDES:${PN} += "libsignon-qt5-1 \
libsignon-qt5.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
