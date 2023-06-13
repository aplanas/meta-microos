SUMMARY = "LeechCraft terminal plugin"
DESCRIPTION = "This package provides a terminal plugin for Leechcraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-eleeminator-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "b810ac17b1089838b90c43dbed6d89804e072684c5ff2ab36be50a73bd64e091d179eda98080c4d23be07e452026333cc003ad4cc798a31375d5f6b1e0bb3c24"

RPROVIDES:${PN} += "leechcraft-eleeminator \
leechcraft-eleeminator(aarch-64) \
libleechcraft_eleeminator.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
leechcraft \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libleechcraft-util-qt5.so.0.6.75()(64bit) \
libleechcraft-util-shortcuts-qt5.so.0.6.75()(64bit) \
libleechcraft-util-sll-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-xpc-qt5.so.0.6.75.2()(64bit) \
libleechcraft-xsd-qt5.so.0.6.75.2()(64bit) \
libqtermwidget5.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
