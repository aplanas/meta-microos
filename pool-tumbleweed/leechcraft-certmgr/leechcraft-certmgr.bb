SUMMARY = "LeechCraft SSL certificate Module"
DESCRIPTION = "This package provides an SSL certificate manager plugin."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-certmgr-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "0050a8c46886a59d2b1418758529f38954922c5105c8107091695c8ec796d6816d87c50cca38f8b8fbc1182ee988684fe192bb6aa010b1adaa275287135577cd"

RPROVIDES:${PN} += "leechcraft-certmgr \
leechcraft-certmgr(aarch-64) \
libleechcraft_certmgr.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
leechcraft \
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
libleechcraft-util-sys-qt5.so.0.6.75.1()(64bit) \
libleechcraft-xsd-qt5.so.0.6.75.2()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
