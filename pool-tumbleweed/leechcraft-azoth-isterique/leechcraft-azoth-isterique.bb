SUMMARY = "LeechCraft Azoth Module to remove CAPS"
DESCRIPTION = "This package provides a plugin for LeechCraft Azoth which \
can remove excessive CAPS usage from incoming messages."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-isterique-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "f8417295635c52fcbe0d8b74f442220a11ef3f07e0beb677a11f4638fcc5e234c2b63cff36feb5ac1cbbab02c20a496f7d57aadf29f2bebfa5bc563ce247c8f9"

RPROVIDES:${PN} += "leechcraft-azoth-isterique \
libleechcraft-azoth-isterique.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
