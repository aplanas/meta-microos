SUMMARY = "LeechCraft Opened tabs overview Module"
DESCRIPTION = "This package provides a tabs overview plugin for Leechcraft \
which shows a grid of overview thumbnails."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-glance-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "55d28e6b3086a4d0304c0cb6de307b32a801af8bdf1a7fa8dda911ccdc274ea0b56ebf8766f00e6584be1043422eb72de3b1a48fcb8a0de58544de80dea94918"

RPROVIDES:${PN} += "leechcraft-glance \
libleechcraft-glance.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
