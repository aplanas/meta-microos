SUMMARY = "PLplot functions for scientific plotting with C++"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the shared lib for PLplot's C++ binding."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "libplplotcxx15-5.15.0-16.2.aarch64.rpm"
RPM_HASH = "cbaf48e3708e8cacc34aba5d3e2cc6aad4c9240e540ae8c1d8bcdd84ae62734dd4aa48a5b389b74b21336813600ae08d4ceb18ce6eb611e9885405dd310b7197"

RPROVIDES:${PN} += "libplplotcxx.so.15()(64bit) \
libplplotcxx15 \
libplplotcxx15(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libplplot.so.17()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
