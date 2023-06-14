SUMMARY = "LeechCraft Global actions Module"
DESCRIPTION = "This package provides a global shortcut manager for LeechCraft \
with which global hotkeys can be set and used."
LICENSE = "BSL-1.0 & (CPL-1.0 | LGPL-2.1-only)"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-gacts-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "91f2c7a4fdcbee799d341ba6835ab5aa00cd82f79e48272de0a4c9cd1e966b2fea0d1e9aa9aeaef4c8a5fb5390758228da350bdd4b53eefb0bebbfdf12c8c420"

RPROVIDES:${PN} += "leechcraft-gacts \
libleechcraft-gacts.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libstdc++.so.6"

inherit rpm
