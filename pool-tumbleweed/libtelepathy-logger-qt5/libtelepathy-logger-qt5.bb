SUMMARY = "Qt Wrapper around TpLogger client library"
DESCRIPTION = "Telepathy-logger-qt5 is a Qt Wrapper around the TpLogger client library. \
It is needed by KDE Telepathy in order to log the chat activity."
LICENSE = "LGPL-2.1-or-later"

PV = "17.09.0"

RPM_NAME = "libtelepathy-logger-qt5-17.09.0-1.17.aarch64.rpm"
RPM_HASH = "8519328db1c11fc33c147cd4608f8d6b78b7b4bdf7330113986a14fce337c0f7fe436a41f47a8d34e5df39c9aa3e7f6d7440b6c1fa821a2c5a121073d529d310"

RPROVIDES:${PN} += "libtelepathy-logger-qt.so.5 \
libtelepathy-logger-qt5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libstdc++.so.6 \
libtelepathy-glib.so.0 \
libtelepathy-logger.so.3 \
libtelepathy-qt5.so.0"

inherit rpm
