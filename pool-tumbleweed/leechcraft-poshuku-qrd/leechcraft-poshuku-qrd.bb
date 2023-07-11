SUMMARY = "LeechCraft Poshuku QR coDe Module"
DESCRIPTION = "This package provides a QR coDe support plugin for LeechCraft Poshuku \
which can represent the URL of a web page as a QR code."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-poshuku-qrd-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "fbe787bd59abf16410f105697ac32eeb7ec33d75201034ecec0ad9fd52e16a420e974327ba2703e25e574590079877c6733b90fdf171a90b96bf8f6c1f35607c"

RPROVIDES:${PN} += "leechcraft-poshuku-qrd \
libleechcraft-poshuku-qrd.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-poshuku \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-gui-qt5.so.0.6.75.1 \
libleechcraft-util-qt5.so.0.6.75 \
libqrencode.so.4 \
libstdc++.so.6"

inherit rpm
