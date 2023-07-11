SUMMARY = "LeechCraft Issue reporting Module"
DESCRIPTION = "This package provides a Dolozhee plugin for LeechCraft which \
allows submitting bug reports and feature requests to the \
LeechCraft issue tracker."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-dolozhee-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "3c4f578edc158121e35af661d97706751994931af17252b99a5c725a00773010d4c4232917f5e309dad07f7c1b949a8a4eb4e18e6fe24efcc55060b193effbde"

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
