SUMMARY = "Qt5 bindings for the Telepathy Library"
DESCRIPTION = "Telepathy-Qt5-farstream is a high-level binding for Telepathy, similar to telepathy-glib but for Qt 5."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.8"

RPM_NAME = "libtelepathy-qt5-farstream0-0.9.8-1.16.aarch64.rpm"
RPM_HASH = "503537e483a6032a4632ebc0bba90880a927e2a5b6ef124e9c0ab32c3c461d34e827e5c6de3bf172afeeee5686363e4b6a39e39a2e5a8612d11c2bb24edc097e"

RPROVIDES:${PN} += "libtelepathy-qt5-farstream.so.0 \
libtelepathy-qt5-farstream0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libstdc++.so.6 \
libtelepathy-farstream.so.3 \
libtelepathy-glib.so.0 \
libtelepathy-qt5.so.0"

inherit rpm
