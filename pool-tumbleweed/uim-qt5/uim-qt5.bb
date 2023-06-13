SUMMARY = "Qt5 input module plugin for uim"
DESCRIPTION = "Contains Qt5 input module plugin for uim"
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & (BSD-3-Clause | LGPL-2.0-only)"

PV = "1.8.8"

RPM_NAME = "uim-qt5-1.8.8-9.9.aarch64.rpm"
RPM_HASH = "3a6a5e1b69dcaabb879789e6770792c358764b1e1efadee4c47dd49807ba6a4f7b2b346981219c8310b20d2ad7ee5100f2e09193710bf30aa1970d384d772abb"

RPROVIDES:${PN} += "libuimplatforminputcontextplugin.so()(64bit) \
uim-qt5 \
uim-qt5(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Gui.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libuim-custom.so.2()(64bit) \
libuim-scm.so.0()(64bit) \
libuim.so.8()(64bit) \
uim"

inherit rpm
