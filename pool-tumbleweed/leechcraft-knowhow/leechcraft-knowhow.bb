SUMMARY = "LeechCraft 'Tip of the day' Module"
DESCRIPTION = "This package provides a tips plugin for LeechCraft which \
displays a 'tip of the day' window after launching LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-knowhow-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "46593b7db02373a8d246b5c4962c0e02e5581d33638114fa8d68c3ec43dccc0ae1f9d77fd8a0faa6c69b7bea89404686985148963abfdd48c27160554ece47b0"

RPROVIDES:${PN} += "leechcraft-knowhow \
libleechcraft-knowhow.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
