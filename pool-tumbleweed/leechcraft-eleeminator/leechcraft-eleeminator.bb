SUMMARY = "LeechCraft terminal plugin"
DESCRIPTION = "This package provides a terminal plugin for Leechcraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-eleeminator-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "a292638e777c0250f4991bab90bd6d5e7b719efdc47da38c7de37077201587881afbbff00c6a0edf3f96091435f3d5e8fe9afe141649fda0596bc65977f61889"

RPROVIDES:${PN} += "leechcraft-eleeminator \
libleechcraft-eleeminator.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-shortcuts-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libqtermwidget5.so.1 \
libstdc++.so.6"

inherit rpm
