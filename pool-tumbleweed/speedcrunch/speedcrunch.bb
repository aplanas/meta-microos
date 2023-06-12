SUMMARY = "Calculator with history display, keyboard-oriented"
DESCRIPTION = "A keyboard-oriented desktop scientific calculator which shows results in a \
scrollable display."
LICENSE = "GPL-2.0+"

PV = "0.12"

RPM_NAME = "speedcrunch-0.12-1.32.aarch64.rpm"
RPM_HASH = "e0bc5def03ed5475412c4b3698e9010328bde03b4c6bf773052721942e0a5df9ba244e15cead2d24e6bad595997c4c29483b00e4f89fb163aa97c7c2177ac915"

RPROVIDES:${PN} += "application() \
application(speedcrunch.desktop) \
metainfo() \
metainfo(speedcrunch.appdata.xml) \
speedcrunch \
speedcrunch(aarch-64)"
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
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
