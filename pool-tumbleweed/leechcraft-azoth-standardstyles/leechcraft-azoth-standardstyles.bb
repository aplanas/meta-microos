SUMMARY = "LeechCraft Azoth Standard chat styles Module"
DESCRIPTION = "This package provides a standard styles support plugin for LeechCraft Azoth. \
 \
Standard styles are the ones in LeechCraft's own format."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-standardstyles-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "70ce92ba1fb5bedaaccf0eb70fa9d9b826e51b920463b2b8891b986c766bef5ad8fd32938c303bf07f2acdb31821d84f398876c3eee4d7df1d3737fd2bdf15cc"

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
