SUMMARY = "LeechCraft terminal plugin"
DESCRIPTION = "This package provides a terminal plugin for Leechcraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-eleeminator-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "b810ac17b1089838b90c43dbed6d89804e072684c5ff2ab36be50a73bd64e091d179eda98080c4d23be07e452026333cc003ad4cc798a31375d5f6b1e0bb3c24"

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
