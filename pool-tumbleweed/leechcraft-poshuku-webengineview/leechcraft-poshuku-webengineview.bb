SUMMARY = "LeechCraft Poshuku WebEngine-based backend Module"
DESCRIPTION = "This package provides WebEngine-based backend for LeechCraft Poshuku browser."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-poshuku-webengineview-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "75d8bc24dd0b44d9ee7db2f002f56566d94f3d1fc5a64fe0e856b86704578843017d73761ecc5ae410c0e03904b9eb19294ea40a671b3b535f80a566a692698b"

RPROVIDES:${PN} += "leechcraft-poshuku-backend \
leechcraft-poshuku-webengineview \
libleechcraft-poshuku-webengineview.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-poshuku \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Sql.so.5 \
libQt5WebChannel.so.5 \
libQt5WebEngineCore.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-db-qt5.so.0.6.75.1 \
libleechcraft-util-gui-qt5.so.0.6.75.1 \
libleechcraft-util-network-qt5.so.0.6.75.1 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
