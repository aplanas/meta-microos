SUMMARY = "LeechCraft Kinetic notifications Module"
DESCRIPTION = "This package contains a fancy notifications plugin for LeechCraft. \
 \
It provides fancy kinetic notifications LeechCraft-wide instead of old-style \
tray-based ones. It supports notifications with HTML markup, notification \
actions (for example, 'Open chat' action in a notification about incoming IM \
message) and is fully themable."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-kinotify-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "d46b567fae76879e098214ed08d871749a0062cce3210049f9ea85739a81600cefe062c25ab36e134fb183a6b5bc534152e27477c7f768d8a4e79b07a9d9f0cd"

RPROVIDES:${PN} += "leechcraft-kinotify \
leechcraft-visualnotifications \
libleechcraft-kinotify.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-gui-qt5.so.0.6.75.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
