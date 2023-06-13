SUMMARY = "LeechCraft Poshuku QR coDe Module"
DESCRIPTION = "This package provides a QR coDe support plugin for LeechCraft Poshuku \
which can represent the URL of a web page as a QR code."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-poshuku-qrd-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "8394287888c8b6115534faa4cff2f44a610a4b697264e2a09e863954c5faa56a42278dd182fe0e20b6ef711fdbdf66e4e4ecce7777fae22b553e1131a31c30f0"

RPROVIDES:${PN} += "leechcraft-poshuku-qrd \
leechcraft-poshuku-qrd(aarch-64) \
libleechcraft_poshuku_qrd.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
leechcraft-poshuku \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libleechcraft-util-gui-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-qt5.so.0.6.75()(64bit) \
libqrencode.so.4()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
