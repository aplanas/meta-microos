SUMMARY = "LeechCraft Opened tabs overview Module"
DESCRIPTION = "This package provides a tabs overview plugin for Leechcraft \
which shows a grid of overview thumbnails."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-glance-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "ce4a7e3b30fcf6383b3a386996eedb365915fe70f6b3ac91cd1a913a7dfcfd1d1489025cdbbd84188deba2d30e723a35f12a9ada6219a7597fcba26ebc362713"

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
