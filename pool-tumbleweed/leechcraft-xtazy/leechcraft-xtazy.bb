SUMMARY = "LeechCraft Current user tune Module"
DESCRIPTION = "This package provides a tune wrapper plugin for LeechCraft \
with which you can get the current user tune via mpris protocol."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-xtazy-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "e7ceac24c949f6106a4bbdc29b68ff060b3d719e718f6fbcfe73e23307035ab35f1a05084bfe062204724523ffcc50340d5a00ef6a9592284931d16017f8e3dc"

RPROVIDES:${PN} += "leechcraft-xtazy \
libleechcraft-xtazy.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
