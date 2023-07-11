SUMMARY = "LeechCraft Azoth Antispam Module"
DESCRIPTION = "This package provides a basic antispam plugin for LeechCraft Azoth."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-herbicide-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "b2b1f067dd46b64565287d52cd6ec3a693e4768d7192a2c149fb60a7d3eadb1725ee5bebc84c2ebc0aad0e229b88b44053038106fb6c76ffc94e6f6f0069a2f4"

RPROVIDES:${PN} += "leechcraft-azoth-herbicide \
libleechcraft-azoth-herbicide.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-db-qt5.so.0.6.75.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
