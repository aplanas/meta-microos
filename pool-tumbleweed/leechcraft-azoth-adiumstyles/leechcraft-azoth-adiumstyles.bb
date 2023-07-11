SUMMARY = "LeechCraft Azoth Adium Styles Module"
DESCRIPTION = "This package provides an Adium styles support plugin for LeechCraft Azoth."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-adiumstyles-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "326926e3892ec59dddef3c46ab89cb01d2406c2498e686d46cc483fb0f0087582dfe6a7c4576d350a01a44b7dfed29d4d048c231b457d006e5fd243b7586337f"

RPROVIDES:${PN} += "leechcraft-azoth-adiumstyles \
leechcraft-azoth-chatstyler \
libleechcraft-azoth-adiumstyles.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5WebEngineWidgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libstdc++.so.6"

inherit rpm
