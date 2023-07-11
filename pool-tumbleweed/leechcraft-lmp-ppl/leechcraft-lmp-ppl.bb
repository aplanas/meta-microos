SUMMARY = "LeechCraft Portable Player Logging Module"
DESCRIPTION = "This package provides Portable Player Logging support for the LeechCraft audio player."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-lmp-ppl-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "eb6942c9da7d8d18210dbd5e2d3f1412d7fc55bde7debced99c49fc3621229efcf38091ea438340531a2cfa684dcde24de58bd346a0dab85671b6faf90c8d188"

RPROVIDES:${PN} += "leechcraft-lmp-ppl \
libleechcraft-lmp-ppl.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-lmp \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libstdc++.so.6"

inherit rpm
