SUMMARY = "LeechCraft System notification Module"
DESCRIPTION = "This package contains a system notification plugin for LeechCraft. \
Notifications are provided implementations supporting FreeDesktop's \
notification standard, like KDE 4.4 (or higher), Gnome, XFCE and others."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-sysnotify-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "d43ce5fbaf9a88d32d3a233f920ce0875510a50f1ec87cd574b5e87a7a411c891483c9f48f5503ebcd5d1e3ec0ba34610cc2f7455c41a84e7824a7f3161e00d9"

RPROVIDES:${PN} += "leechcraft-sysnotify \
leechcraft-visualnotifications \
libleechcraft-sysnotify.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libstdc++.so.6"

inherit rpm
