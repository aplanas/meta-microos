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
leechcraft-kinotify(aarch-64) \
leechcraft-visualnotifications \
libleechcraft_kinotify.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
leechcraft \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libleechcraft-util-gui-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-qt5.so.0.6.75()(64bit) \
libleechcraft-util-sll-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-xpc-qt5.so.0.6.75.2()(64bit) \
libleechcraft-xsd-qt5.so.0.6.75.2()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
