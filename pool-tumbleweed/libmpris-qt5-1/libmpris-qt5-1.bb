SUMMARY = "Qtmpris libraries"
DESCRIPTION = "This package contains the libraries for qtmpris"
LICENSE = "LGPL-2.1+"

PV = "1.0.6"

RPM_NAME = "libmpris-qt5-1-1.0.6-2.7.aarch64.rpm"
RPM_HASH = "68a2b713cd3b7b211989be2c7e816718e640bd316a7aa1bd102d02865305cf1ff6fdd02990c0902ed0c154e8430ecd7dc9060d6a41ac990e03c48432d7cfe2bc"

RPROVIDES:${PN} += "libmpris-qt5-1 \
libmpris-qt5-1(aarch-64) \
libmpris-qt5.so.1()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
