SUMMARY = "Qt5 bindings for the Telepathy Library"
DESCRIPTION = "Telepathy-Qt5-farstream is a high-level binding for Telepathy, similar to telepathy-glib but for Qt 5."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.8"

RPM_NAME = "libtelepathy-qt5-farstream0-0.9.8-1.15.aarch64.rpm"
RPM_HASH = "4299d66c9cf7476cf26ad80f6fefcb4721efbd058ea09a4f7947eb3514bc4d4bd3048b8adb3ad638521169c3b22648bdd5adf41a36ae180d67372375ae7b8973"

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
