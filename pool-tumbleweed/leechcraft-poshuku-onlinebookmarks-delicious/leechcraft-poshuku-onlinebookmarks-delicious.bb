SUMMARY = "LeechCraft Poshuku Onlinebookmarks Delicious Module"
DESCRIPTION = "This package contains a plugin for LeechCraft Poshuku Online Bookmarks \
to support the Del.icio.us service."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-poshuku-onlinebookmarks-delicious-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "ef8691aa6db60bd26930ffaba5c04824fcae029e9116020d6586764eb66033b2c12640a3ce334eb50a7f0346f2cfe51584004c48b1a809a73abc9e31a800d972"

RPROVIDES:${PN} += "leechcraft-poshuku-onlinebookmarks-delicious \
libleechcraft-poshuku-onlinebookmarks-delicious.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-poshuku-onlinebookmarks \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
