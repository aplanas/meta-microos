SUMMARY = "LeechCraft Radio streams Module"
DESCRIPTION = "This package provides a radio streams provider plugin for LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-hotstreams-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "7fee67d0d44070ca8b9db7b8aef2d4695167bc3d4f7578dba5a888d0fac972caf6b0e379a631cd3b3061dcbe65e9674fe6ff2907e3c5636bf1cf7960adf29600"

RPROVIDES:${PN} += "leechcraft-hotstreams \
leechcraft-hotstreams(aarch-64) \
libleechcraft_hotstreams.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
leechcraft-lmp \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libleechcraft-util-qt5.so.0.6.75()(64bit) \
libleechcraft-util-sll-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-sys-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-xpc-qt5.so.0.6.75.2()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
