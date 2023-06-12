SUMMARY = "Cppunit library for writting C++ unittests"
DESCRIPTION = "Cppunit library for writting C++ unittests in JUnit like fashion."
LICENSE = "LGPL-2.1-or-later"

PV = "1.15.1"

RPM_NAME = "libcppunit-1_15-1-1.15.1-1.13.aarch64.rpm"
RPM_HASH = "f1bf78160413a6f3aa2ac6cb1a30c96c8418697b82c002f81a9466c7b11d4a6105d13c3d6a46c41f30923ae861857032d3b3eca83e60671de34e83d1c633f5ca"

RPROVIDES:${PN} += "libcppunit-1.15.so.1()(64bit) \
libcppunit-1_15-1 \
libcppunit-1_15-1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
