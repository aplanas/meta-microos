SUMMARY = "Shared library for Qt Widgets"
DESCRIPTION = "This package contains the shared library to run Technical Applications \
developed with/for qwt."
LICENSE = "SUSE-QWT-1.0"

PV = "5.2.3_qt5+git20181129.2819734"

RPM_NAME = "libqwt5-qt5-5-5.2.3_qt5+git20181129.2819734-3.18.aarch64.rpm"
RPM_HASH = "9a63868c77ec165c047330b7f10e4e52c2dfa8ad908fee0806ef331beba892c1190fb8619ced249062ed9d9a04664b71a3f74630ca8ec8994caadb3c2ac7acd1"

RPROVIDES:${PN} += "libqwt5-qt5-5 \
libqwt5-qt5-5(aarch-64) \
libqwt5-qt5.so.5()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
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
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
