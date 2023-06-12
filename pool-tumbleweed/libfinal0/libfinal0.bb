SUMMARY = "Console widget toolkit"
DESCRIPTION = "FINAL CUT is a class library and widget toolkit with full mouse \
support for creating a text-based user interface. The library supports \
the programmer to develop an application for the text console. It allows \
the simultaneous handling of multiple windows on the screen. \
The C++ class design was inspired by the Qt framework. It provides \
common controls like dialog windows, push buttons, check boxes, \
radio buttons, input lines, list boxes, status bars and so on."
LICENSE = "LGPL-3.0-or-later"

PV = "0.9.0"

RPM_NAME = "libfinal0-0.9.0-1.1.aarch64.rpm"
RPM_HASH = "c3a6c250b1b54903bb8065bfac07672263a46bd6299cbef0b8ee37be81ca531c3a5278399dc698dbac7aeb43b9e616f40571847e0cecd704a8ba648873916a4d"

RPROVIDES:${PN} += "libfinal.so.0()(64bit) \
libfinal0 \
libfinal0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgpm.so.2()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit)"

inherit rpm
