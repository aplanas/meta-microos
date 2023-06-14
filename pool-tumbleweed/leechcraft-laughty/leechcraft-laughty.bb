SUMMARY = "LeechCraft Notification Server Module"
DESCRIPTION = "This package provides a desktop notifications server plugin for Leechcraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-laughty-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "35e30d4378126e3cd288ed661163c7776d3e7a3a2f36d789766b2ca1ac06a95b12c90c1413ebad2c11b6187ad73fac5c3184d194ac2735c5aeba48fdab6707f0"

RPROVIDES:${PN} += "leechcraft-laughty \
libleechcraft-laughty.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-xdg-qt5.so.0.6.75 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
