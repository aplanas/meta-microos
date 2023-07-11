SUMMARY = "LeechCraft Image Paster Module"
DESCRIPTION = "This module provides a simple image paster plugin from LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-imgaste-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "0d5f5741e6045aec25b60ac975ae1122867b5864139a4f30db1c93959fcab837a9f5afef85085cff7a3f5c726af7ed628cf5adea4a7e5ce48e91a95073695229"

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
