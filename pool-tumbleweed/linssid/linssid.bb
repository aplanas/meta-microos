SUMMARY = "Graphical wireless scanning for Linux"
DESCRIPTION = "LinSSID is graphically and functionally similar to Inssider (from \
Microsoft Windows). \
It is written in C++ using Linux wireless tools and Qt5."
LICENSE = "GPL-3.0-only"

PV = "3.6"

RPM_NAME = "linssid-3.6-3.12.aarch64.rpm"
RPM_HASH = "55aedcc6364607e27e64419344d4e948984adeaeeed0ded86998031af1952d3740c1e732b861414ac57419fba5b9db0dfe56f623d6fef1475259791e6b7bbf0b"

RPROVIDES:${PN} += "application() \
application(linssid.desktop) \
linssid \
linssid(aarch-64)"
RDEPENDS:${PN} += "iw \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libqwt-qt5.so.6.2()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
