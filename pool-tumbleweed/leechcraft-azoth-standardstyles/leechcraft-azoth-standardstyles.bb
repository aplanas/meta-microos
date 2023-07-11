SUMMARY = "LeechCraft Azoth Standard chat styles Module"
DESCRIPTION = "This package provides a standard styles support plugin for LeechCraft Azoth. \
 \
Standard styles are the ones in LeechCraft's own format."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-standardstyles-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "53923c074ee148a40517ce166cba19f9cc1fdeb9b1f40dc22637934183d53e2bcc506d1070984ae735fd8ddab58e2e7ee84f24c732f934f84f454bb33c42930e"

RPROVIDES:${PN} += "leechcraft-azoth-chatstyler \
leechcraft-azoth-standardstyles \
libleechcraft-azoth-standardstyles.so"

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
