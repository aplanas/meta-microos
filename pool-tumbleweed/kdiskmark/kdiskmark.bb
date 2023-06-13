SUMMARY = "A simple open-source disk benchmark tool for Linux distros"
DESCRIPTION = "KDiskMark is an HDD and SSD benchmark tool with a very friendly graphical user interface."
LICENSE = "GPL-3.0-only"

PV = "3.1.3"

RPM_NAME = "kdiskmark-3.1.3-1.1.aarch64.rpm"
RPM_HASH = "3cc637469623b26610143146ec0fc01d6a4f7eaa2dabfea64754f2da8becfc8c81866239ebb4459d04936241c0e44358cb86a4aa257dac6240485332e715f3c2"

RPROVIDES:${PN} += "application() \
application(kdiskmark.desktop) \
bundled(singleapplication) \
kdiskmark \
kdiskmark(aarch-64)"

RDEPENDS:${PN} += "fio \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libpolkit-qt5-core-1.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit)"

inherit rpm
