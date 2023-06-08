SUMMARY = "AV1 Codec Library Tools"
DESCRIPTION = "This package contains tools included with libaom, a library for \
the AOMedia Video 1 (AV1) video coding format."
LICENSE = "BSD-2-Clause"

PV = "3.6.0"

RPM_NAME = "aom-tools-3.6.0-2.1.aarch64.rpm"
RPM_HASH = "cc72f211f0dfd1ebaba38a05331c748a6f7155de52b76dc73661ec10223b9f765c7b81d6af145feb21d0a0e63aed316838c874e33c4f2868382277bd8398769d"

RPROVIDES:${PN} += "aom-tools aom-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libaom.so.3()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
