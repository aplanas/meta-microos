SUMMARY = "LeechCraft System notification Module"
DESCRIPTION = "This package contains a system notification plugin for LeechCraft. \
Notifications are provided implementations supporting FreeDesktop's \
notification standard, like KDE 4.4 (or higher), Gnome, XFCE and others."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-sysnotify-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "cf5d42bc869d79ad99dd6b167f5d31f76ff97de95b1056f80fc5b585cbd46e76ab44830b31ef76cb34f2ab52c91481ffe3b0ccec5799592b6e63b69dfe03eadb"

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
