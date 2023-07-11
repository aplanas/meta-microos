SUMMARY = "LeechCraft Global actions Module"
DESCRIPTION = "This package provides a global shortcut manager for LeechCraft \
with which global hotkeys can be set and used."
LICENSE = "BSL-1.0 & (CPL-1.0 | LGPL-2.1-only)"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-gacts-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "05ee1908771c331d17349522b8ecf33cbca8a22d4b43c4c9cfdfff7a3c19a10a20a56129a9db71be68e1455b9091028f1669ef87c0e02aeda692db73e4c035fb"

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
