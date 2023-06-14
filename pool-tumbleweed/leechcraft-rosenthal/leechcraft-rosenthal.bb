SUMMARY = "LeechCraft Spell Checker Module"
DESCRIPTION = "This package provides a spell checker plugin for LeechCraft. \
 \
It is based on Hunspell or Myspell dictionaries."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-rosenthal-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "e0790d6941a5145becfbf02b46fb56f240ab93e5da6a9b3bdaa205a7da38a1c14d5d12037198bbedac615ca4c4d6014b0d4c87485f746f559936287093d06c55"

RPROVIDES:${PN} += "leechcraft-rosenthal \
libleechcraft-rosenthal.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libhunspell-1.7.so.0 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
