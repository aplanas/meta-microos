SUMMARY = "LeechCraft Poshuku Online Bookmarks Module"
DESCRIPTION = "This package provides an online bookmarks plugin for LeechCraft Poshuku \
for synchronization of bookmarks with services like Read It Later \
or Del.icio.us."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-poshuku-onlinebookmarks-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "799bf719fc91a6d57f0bffa5ed7b29912e4d33a2e715783f91a216e3f831f2ed6ac45cdd282e51a13dc5190f01a29c66ffe0d38da95d0bf30474309ebe5cdbf9"

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
