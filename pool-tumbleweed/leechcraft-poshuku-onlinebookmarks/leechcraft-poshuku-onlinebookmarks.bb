SUMMARY = "LeechCraft Poshuku Online Bookmarks Module"
DESCRIPTION = "This package provides an online bookmarks plugin for LeechCraft Poshuku \
for synchronization of bookmarks with services like Read It Later \
or Del.icio.us."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-poshuku-onlinebookmarks-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "7964b86de3313ab86888be3ed27707144f65a28ae1599c426f94b3609dc8dd9ee889aed87054e0ced40e7050c1995b4a00bee64c680dfa5e7f46abd55184c4a6"

RPROVIDES:${PN} += "leechcraft-poshuku-onlinebookmarks \
libleechcraft-poshuku-onlinebookmarks.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-poshuku \
leechcraft-securestorage \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
