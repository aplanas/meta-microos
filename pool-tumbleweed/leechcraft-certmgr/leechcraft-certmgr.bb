SUMMARY = "LeechCraft SSL certificate Module"
DESCRIPTION = "This package provides an SSL certificate manager plugin."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-certmgr-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "0050a8c46886a59d2b1418758529f38954922c5105c8107091695c8ec796d6816d87c50cca38f8b8fbc1182ee988684fe192bb6aa010b1adaa275287135577cd"

RPROVIDES:${PN} += "leechcraft-certmgr \
libleechcraft-certmgr.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
