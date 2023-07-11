SUMMARY = "LeechCraft Poshuku Google Search plugin"
DESCRIPTION = "This package provides a LeechCraft plugin to do a Google search \
with some selected text."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-pogooglue-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "0ecc8d974eb14bed6e8e0134a3065ef3759a68d305fa92ca90cbc3b92d8c42233a96fd26a6849a198f0bd774a5220949650ceeeb8d55f3b219f4ab7f705e22f5"

RPROVIDES:${PN} += "leechcraft-pogooglue \
libleechcraft-pogooglue.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
