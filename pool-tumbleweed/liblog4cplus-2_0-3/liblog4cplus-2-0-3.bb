SUMMARY = "C++ logging library"
DESCRIPTION = "log4cplus is a simple to use C++ logging API providing thread-safe, \
flexible, and arbitrarily granular control over log management and \
configuration. It is modeled after the Java log4j API."
LICENSE = "Apache-2.0"

PV = "2.0.8"

RPM_NAME = "liblog4cplus-2_0-3-2.0.8-1.4.aarch64.rpm"
RPM_HASH = "73b935f61fb7621b5c602f0cc03032139dd5d8a003706b224caa3290c361ce033a9cce9b8ffad20b4edcb1391c88a7879c28e739929080aa44834edd6d09a5a1"

RPROVIDES:${PN} += "liblog4cplus-2.0.so.3()(64bit) \
liblog4cplus-2_0-3 \
liblog4cplus-2_0-3(aarch-64) \
liblog4cplusU-2.0.so.3()(64bit) \
log4cplus"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.11)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.2)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
