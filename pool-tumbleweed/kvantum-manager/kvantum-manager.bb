SUMMARY = "GUI for installing, selecting and manipulating Kvantum themes"
DESCRIPTION = "This package provides configuration manager - GUI appligation for installing, selecting and manipulating Kvantum themes."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.10"

RPM_NAME = "kvantum-manager-1.0.10-1.1.aarch64.rpm"
RPM_HASH = "09da8b91e93e1a9815579d7861b94e123030372dfbbfe8e1263d71f34299b1a914df44c0191ef982015d8802da02c6627f8f39ad7039366cb4c64aff0658bbd2"

RPROVIDES:${PN} += "application() \
application(kvantummanager.desktop) \
kvantum-manager \
kvantum-manager(aarch-64)"
RDEPENDS:${PN} += "kvantum-qt5 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
