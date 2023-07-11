SUMMARY = "LeechCraft Radio streams Module"
DESCRIPTION = "This package provides a radio streams provider plugin for LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-hotstreams-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "eb9bc4a107b6c0d39bd6c0d77b7ee3e3b673163dae7bcb5220a57193924b4996bcd6b74a471f0b275d8092310065da921b541b1a4277dc3023fc1db3b2b50095"

RPROVIDES:${PN} += "leechcraft-hotstreams \
libleechcraft-hotstreams.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-lmp \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
