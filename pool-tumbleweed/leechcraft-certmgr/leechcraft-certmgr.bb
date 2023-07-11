SUMMARY = "LeechCraft SSL certificate Module"
DESCRIPTION = "This package provides an SSL certificate manager plugin."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-certmgr-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "fbd615eee57debedb8e1513e8b6cf4b40c655b56e4217d8281b07c3080480695523fc4bea4ee6526f109873bbbd66f9249d152b60343dd3a2a52fff2308c048a"

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
