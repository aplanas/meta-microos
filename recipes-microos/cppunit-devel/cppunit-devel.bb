SUMMARY = "Include Files and Libraries for cppunit"
DESCRIPTION = "Cppunit library, headers, and all relevant additions for writting C++ unittests \
in JUnit like fashion."
LICENSE = "LGPL-2.1-or-later"

PV = "1.15.1"

RPM_NAME = "cppunit-devel-1.15.1-1.13.aarch64.rpm"
RPM_HASH = "75a9701efc298f130a13519aca357aaad69e57e37e46df1499225922aba4551e69b5e0ffada79f3b90a3e87aff0f4751039bce7e45d871922fe8fde4dab106f9"

RPROVIDES:${PN} += "cppunit-devel cppunit-devel(aarch-64) libcppunit-devel pkgconfig(cppunit)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcppunit-1.15.so.1()(64bit) libcppunit-1_15-1 libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
