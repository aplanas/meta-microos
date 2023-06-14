SUMMARY = "LeechCraft Poshuku Google Search plugin"
DESCRIPTION = "This package provides a LeechCraft plugin to do a Google search \
with some selected text."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-pogooglue-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "e95bb3403233778c3b75ae469c76a12c04ed546760fb277866c7e2d09d40465cefbea768a87ff64ef2662b144a76c90e3ce1fb7b742d1b90e72db21c52d7f1f6"

RPROVIDES:${PN} += "leechcraft-pogooglue \
libleechcraft-pogooglue.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
