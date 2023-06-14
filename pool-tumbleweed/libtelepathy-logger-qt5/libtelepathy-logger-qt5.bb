SUMMARY = "Qt Wrapper around TpLogger client library"
DESCRIPTION = "Telepathy-logger-qt5 is a Qt Wrapper around the TpLogger client library. \
It is needed by KDE Telepathy in order to log the chat activity."
LICENSE = "LGPL-2.1-or-later"

PV = "17.09.0"

RPM_NAME = "libtelepathy-logger-qt5-17.09.0-1.16.aarch64.rpm"
RPM_HASH = "86feaf0e2b50282c1f0e04b0516dfdf56bfbe196d19be54788c5a3157dc5146c766b5a17e75e128814568989ca3a68e24eae9c6550c6108f93fd61b8eb17066d"

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
