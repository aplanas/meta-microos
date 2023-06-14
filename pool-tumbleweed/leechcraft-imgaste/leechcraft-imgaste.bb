SUMMARY = "LeechCraft Image Paster Module"
DESCRIPTION = "This module provides a simple image paster plugin from LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-imgaste-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "c7b0f5b5ccd0d5469c8a8676a450fb4745a3b00f80cf9f4abb2c375daf2f6bd60f8faa1c0258684c02368504a8f6cbfa72edbf582a74ebcd9b102dccd5611434"

RPROVIDES:${PN} += "leechcraft-imgaste \
libleechcraft-imgaste.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-network-qt5.so.0.6.75.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
