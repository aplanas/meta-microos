SUMMARY = "LeechCraft Spell Checker Module"
DESCRIPTION = "This package provides a spell checker plugin for LeechCraft. \
 \
It is based on Hunspell or Myspell dictionaries."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-rosenthal-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "7732d1c2d04738306642a4693b9948d7a26c8592ee3e58341ffd7b8fb7fc2ef7674a0524c9495081cec9bceca71707356a82f5582b612fc6823452b415e1eab9"

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
