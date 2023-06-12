SUMMARY = "qpdfview plugin: DjVu documents"
DESCRIPTION = "This plugin is required to read DjVu documents \
(*.djvu files) with the qpdfview document viewer."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "qpdfview-plugin-djvu-0.5.0-1.3.aarch64.rpm"
RPM_HASH = "30e767b7b683ea8c5896d7d9b738954cbf6a5f7a328988abc572e292c2382687f2364f0a172d91fd8d5f68c657995a80e36bcf71b2368571c6ab1d167ddf375e"

RPROVIDES:${PN} += "libqpdfview_djvu.so()(64bit) \
qpdfview-plugin-djvu \
qpdfview-plugin-djvu(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libdjvulibre.so.21()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
qpdfview"

inherit rpm
