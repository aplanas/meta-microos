SUMMARY = "PostScript support for LeechCraft Monocle"
DESCRIPTION = "This package contains the PostRus subplugin for LeechCraft Monocle \
which supports PostScript document support via the ghostscript utilities."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-monocle-postrus-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "78b457684563ae909235543e3e4e5087d378870fdcad55860a67fa2a6ee2e47e6638ed27790e4bfe68513829e46506b8e27e8d73686c7d2c4d6b45fe601aac5f"

RPROVIDES:${PN} += "application() \
application(leechcraft-monocle-postrus-qt5.desktop) \
leechcraft-monocle-postrus \
leechcraft-monocle-postrus(aarch-64) \
leechcraft-monocle-subplugin \
libleechcraft_monocle_postrus.so()(64bit) \
mimehandler(application/postscript)"

RDEPENDS:${PN} += "ghostscript \
ld-linux-aarch64.so.1()(64bit) \
leechcraft-monocle-pdf \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libleechcraft-util-qt5.so.0.6.75()(64bit) \
libleechcraft-util-sys-qt5.so.0.6.75.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
