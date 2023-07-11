SUMMARY = "LeechCraft Poshuku Autosearch Module"
DESCRIPTION = "This package provides an autosearch plugin for LeechCraft Poshuku."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-poshuku-autosearch-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "973f7966bf6e3d7272cae033c24ffa7936e1b9c0b8ff7d7e6aa823c144d29b4292eb74569e594e0164f770d77c0d8df91274b6ba70b64ae507f4aeb169921a6f"

RPROVIDES:${PN} += "leechcraft-poshuku-autosearch \
libleechcraft-poshuku-autosearch.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-poshuku \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libstdc++.so.6"

inherit rpm
