SUMMARY = "LeechCraft Azoth Autopaste Module"
DESCRIPTION = "This package provides a plugin for LeechCraft Azoth with \
which long messages can automatically be pasted to pastebins."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-autopaste-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "398919161293a61b6000530345454d243d324ade215ebf17f4dd91157adce57fd7c073033b492d2759490d18c537d23d6e327626ed99221f7cedb879e6f159bf"

RPROVIDES:${PN} += "leechcraft-azoth-autopaste \
leechcraft-azoth-autopaste(aarch-64) \
libleechcraft_azoth_autopaste.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
leechcraft-azoth \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libleechcraft-util-qt5.so.0.6.75()(64bit) \
libleechcraft-util-xpc-qt5.so.0.6.75.2()(64bit) \
libleechcraft-xsd-qt5.so.0.6.75.2()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
