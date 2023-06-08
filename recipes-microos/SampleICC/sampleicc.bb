SUMMARY = "Color Management System"
DESCRIPTION = "SampleICC is a C++ library for reading, writing, manipulating, and \
applying ICC profiles along with applications that make use of this \
library."
LICENSE = "BSD-3-Clause"

PV = "1.6.8"

RPM_NAME = "SampleICC-1.6.8-4.8.aarch64.rpm"
RPM_HASH = "44ed198bee22f21384194ddd8cc47428393f055583d398352bb44d70556003b184af9b2d15681d9451e66c83257e66211b0c1f0c06f63a65236cd9fff2b933f4"

RPROVIDES:${PN} += "SampleICC SampleICC(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libICC_utils.so.2()(64bit) libSampleICC.so.2()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libtiff.so.6()(64bit) libtiff.so.6(LIBTIFF_4.0)(64bit)"

inherit rpm
