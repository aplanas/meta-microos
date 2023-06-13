SUMMARY = "LeechCraft Tab Session Manager Module"
DESCRIPTION = "This package provides a Tab Session Manager plugin for Leechcraft \
which allows to automatically restore the last session and allows \
to create named sessions."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-tabsessionmanager-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "79a9536d076b8c0525ba6da01ecb83d642eb9d3ec4c13d48648b0caf79f19eca1002ca8e142d62ea4e145006a9b1a4562a10a5081ee3e3e50f9568dfcd9d7661"

RPROVIDES:${PN} += "leechcraft-tabsessionmanager \
leechcraft-tabsessionmanager(aarch-64) \
libleechcraft_tabsessmanager.so()(64bit)"

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
libleechcraft-util-sll-qt5.so.0.6.75.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
