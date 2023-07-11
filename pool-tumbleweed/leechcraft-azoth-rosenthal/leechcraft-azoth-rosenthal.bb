SUMMARY = "LeechCraft Azoth Spell Checker Module"
DESCRIPTION = "This package provides a spell checker plugin for LeechCraft Azoth. \
 \
It is based on Hunspell or Myspell dictionaries."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-rosenthal-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "facbf1b90a83ca4fd046f32f9d6856d2c9ebb7f833cecf0cffb2213cdd37a19ab98bd9a2cc55678444fa93308628ddb5de5d2482e745db5b775aa0725c131b73"

RPROVIDES:${PN} += "leechcraft-azoth-rosenthal \
libleechcraft-azoth-rosenthal.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
leechcraft-rosenthal \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libstdc++.so.6"

inherit rpm
