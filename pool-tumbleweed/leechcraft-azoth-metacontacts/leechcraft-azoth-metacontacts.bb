SUMMARY = "LeechCraft Azoth Metacontacts Module"
DESCRIPTION = "This package provides a metacontacts support plugin for LeechCraft Azoth."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-metacontacts-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "dca16208f8b175befde6ef08a4e3bcd284341c183bce2764e1ca354e69832721a37c6de8dba5b9c14b0840d710c50def92a80cb12720e997aa027a8acce6282f"

RPROVIDES:${PN} += "leechcraft-azoth-metacontacts \
libleechcraft-azoth-metacontacts.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-gui-qt5.so.0.6.75.1 \
libleechcraft-util-qt5.so.0.6.75 \
libstdc++.so.6"

inherit rpm
