SUMMARY = "LeechCraft Azoth Adium Styles Module"
DESCRIPTION = "This package provides an Adium styles support plugin for LeechCraft Azoth."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-adiumstyles-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "278488b9fa7d37de7cd48d18aca0ad277e1361d08f4d86c7197323ff5e4653e0e30298c18827ff4377661f5ab59d086964e6bc05ddeaa05e76b0c1f6724ce613"

RPROVIDES:${PN} += "leechcraft-azoth-adiumstyles \
leechcraft-azoth-adiumstyles(aarch-64) \
leechcraft-azoth-chatstyler \
libleechcraft_azoth_adiumstyles.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
leechcraft-azoth \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5WebEngineWidgets.so.5()(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libleechcraft-util-qt5.so.0.6.75()(64bit) \
libleechcraft-util-sys-qt5.so.0.6.75.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
