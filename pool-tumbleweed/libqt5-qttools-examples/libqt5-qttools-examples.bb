SUMMARY = "Qt5 tools examples"
DESCRIPTION = "Examples for the libqt5-qttools module."
LICENSE = "BSD-3-Clause"

PV = "5.15.9+kde1"

RPM_NAME = "libqt5-qttools-examples-5.15.9+kde1-1.1.aarch64.rpm"
RPM_HASH = "6434f384edd7b6d39b6d28d491cf2c3d08d73f7eb04dee26e908f4ddd845c7ec4a0090bc57b3d0e3c288354ca3a80d0937f60d8b11fa89c30ad130d853794bca"

RPROVIDES:${PN} += "libqt5-qttools-examples \
libqt5-qttools-examples(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Help.so.5()(64bit) \
libQt5Help.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
