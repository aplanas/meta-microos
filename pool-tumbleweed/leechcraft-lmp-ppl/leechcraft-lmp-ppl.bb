SUMMARY = "LeechCraft Portable Player Logging Module"
DESCRIPTION = "This package provides Portable Player Logging support for the LeechCraft audio player."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-lmp-ppl-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "92cbe9be326a49b9df9e375669c66bc0845e0748d2891e22bbacdb6fb830fc88c4c631e94d6d2ff3b01c8fdfbf5245f74960c8ffffce6e29b043738995234a48"

RPROVIDES:${PN} += "leechcraft-lmp-ppl \
libleechcraft-lmp-ppl.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-lmp \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libstdc++.so.6"

inherit rpm
