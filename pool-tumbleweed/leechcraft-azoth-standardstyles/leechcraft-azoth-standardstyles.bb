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
leechcraft-azoth-standardstyles(aarch-64) \
libleechcraft_azoth_standardstyles.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
leechcraft-azoth \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5WebEngineWidgets.so.5()(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libleechcraft-util-qt5.so.0.6.75()(64bit) \
libleechcraft-util-sys-qt5.so.0.6.75.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
