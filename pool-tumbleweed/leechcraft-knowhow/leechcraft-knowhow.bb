SUMMARY = "LeechCraft 'Tip of the day' Module"
DESCRIPTION = "This package provides a tips plugin for LeechCraft which \
displays a 'tip of the day' window after launching LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-knowhow-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "46593b7db02373a8d246b5c4962c0e02e5581d33638114fa8d68c3ec43dccc0ae1f9d77fd8a0faa6c69b7bea89404686985148963abfdd48c27160554ece47b0"

RPROVIDES:${PN} += "leechcraft-knowhow \
leechcraft-knowhow(aarch-64) \
libleechcraft_knowhow.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
leechcraft \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libleechcraft-util-qt5.so.0.6.75()(64bit) \
libleechcraft-util-sys-qt5.so.0.6.75.1()(64bit) \
libleechcraft-xsd-qt5.so.0.6.75.2()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
