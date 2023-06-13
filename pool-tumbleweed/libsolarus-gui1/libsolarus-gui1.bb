SUMMARY = "Solarus game engine shared library (GUI parts)"
DESCRIPTION = "This package provides the GUI shared library of the Solarus game \
engine."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.5"

RPM_NAME = "libsolarus-gui1-1.6.5-2.15.aarch64.rpm"
RPM_HASH = "0ddb36bf1897c6d894c10378e629e73b91fa2655b11cdf8e9d1a4ecfeb40514f7b59bd9f41b134a6fe054084bca812f445efc82fce8c65ab320154143ca1346b"

RPROVIDES:${PN} += "libsolarus-gui.so.1()(64bit) \
libsolarus-gui1 \
libsolarus-gui1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libluajit-5.1.so.2()(64bit) \
libsolarus.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
