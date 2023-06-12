SUMMARY = "Deepin Toolkit Core libraries"
DESCRIPTION = "Deepint Tool Kit (Dtk) is the base devlopment tool of all C++/Qt Developer work \
on Deepin."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.33"

RPM_NAME = "libdtkcore5-5.5.33-1.7.aarch64.rpm"
RPM_HASH = "d051596d43f081b5d66e77cec9d6990509cc1986707901aaa237124cac23d32deec78a6a708ad73d20b6f967a2798853dba07c57cc0ccae07746b4e6a2666c3c"

RPROVIDES:${PN} += "libdtkcore.so.5()(64bit) \
libdtkcore5 \
libdtkcore5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
deepin-desktop-base \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgsettings-qt.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
