SUMMARY = "LeechCraft Notification Server Module"
DESCRIPTION = "This package provides a desktop notifications server plugin for Leechcraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-laughty-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "48ffa1396939e5881dc302027cf3c0ebed00d2b1a3acffd930a1fd80ea13cb0cae55b51424265abd0a60dca14dd75255b40bca920815d352a28a15e0e57491a7"

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
