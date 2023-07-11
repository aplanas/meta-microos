SUMMARY = "FictionBook support for LeechCraft Monocle"
DESCRIPTION = "This package contains the FictionBook subplugin for LeechCraft Monocle."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-monocle-fxb-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "8ca8e7759fc3964568b6e022b2d37101c66bdefb5e3aa4b4c16178385b58cf9fd9c45bab2bb2020257c40a175798d008d51394061d4ee07ed0dfdee216a4209d"

RPROVIDES:${PN} += "leechcraft-monocle-fxb \
leechcraft-monocle-subplugin \
libleechcraft-monocle-fxb.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-monocle \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-monocle.so \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
