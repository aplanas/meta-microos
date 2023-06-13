SUMMARY = "LeechCraft Global actions Module"
DESCRIPTION = "This package provides a global shortcut manager for LeechCraft \
with which global hotkeys can be set and used."
LICENSE = "BSL-1.0 & (CPL-1.0 | LGPL-2.1-only)"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-gacts-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "91f2c7a4fdcbee799d341ba6835ab5aa00cd82f79e48272de0a4c9cd1e966b2fea0d1e9aa9aeaef4c8a5fb5390758228da350bdd4b53eefb0bebbfdf12c8c420"

RPROVIDES:${PN} += "leechcraft-gacts \
leechcraft-gacts(aarch-64) \
libleechcraft_gacts.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
leechcraft \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libleechcraft-util-qt5.so.0.6.75()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
