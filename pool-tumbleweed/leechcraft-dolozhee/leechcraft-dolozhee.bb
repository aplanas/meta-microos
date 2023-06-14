SUMMARY = "LeechCraft Issue reporting Module"
DESCRIPTION = "This package provides a Dolozhee plugin for LeechCraft which \
allows submitting bug reports and feature requests to the \
LeechCraft issue tracker."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-dolozhee-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "831b75dcb29fd46c44183bb7e7dad20f6244970e3072c11ee58ff7e7f5f172214b47b2fa5e85cb18f95acf96aee824b09aef4bc69b35c41f0590e5a5b62e90f2"

RPROVIDES:${PN} += "leechcraft-dolozhee \
libleechcraft-dolozhee.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
