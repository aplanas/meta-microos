SUMMARY = "LeechCraft Blasq VKontakte client Module"
DESCRIPTION = "This package provides a VKontakte image storage client subplugin \
for LeechCraft Blasq."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-blasq-rappor-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "314317a001056a3cc5ac19e0f2726c2f98304755c487339a01563d27686ac9b49b6f3170b1c5328eee9abda017d1fdefdbad80e8355507ad9fe643881172a330"

RPROVIDES:${PN} += "leechcraft-blasq-rappor \
leechcraft-blasq-rappor(aarch-64) \
leechcraft-blasq-subplugin \
libleechcraft_blasq_rappor.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
leechcraft-blasq \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libleechcraft-util-gui-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-qt5.so.0.6.75()(64bit) \
libleechcraft-util-sll-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-svcauth-qt5.so.0.6.75()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
