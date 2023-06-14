SUMMARY = "LeechCraft Media synchronization Module"
DESCRIPTION = "This package provides an audio syncing plugin for LeechCraft \
to synchronize with Flash-like media players."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-lmp-dumbsync-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "e1777705e97f42d0eb1440f097c20be4684d1c69f037f0b1c247f207029c7200a8fd0aa64d9bf12318f17d65eb0eb956acda4e385433f8062307d0e8b4feb566"

RPROVIDES:${PN} += "leechcraft-lmp-dumbsync \
libleechcraft-lmp-dumbsync.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-lmp \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
