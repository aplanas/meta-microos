SUMMARY = "LeechCraft Azoth Ignore Module"
DESCRIPTION = "This package provides a plugin for LeechCraft Azoth to ignore \
unwanted participants."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-depester-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "020ebc98a17190e8f3b90ac1355e1ceafd87bfee417d60cde2043ea61af0bf8f73571e08352522a4020c6e8727897ad2e3bf160cf99f09492b46e2e01dcfcf2f"

RPROVIDES:${PN} += "leechcraft-azoth-depester \
libleechcraft-azoth-depester.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libstdc++.so.6"

inherit rpm
