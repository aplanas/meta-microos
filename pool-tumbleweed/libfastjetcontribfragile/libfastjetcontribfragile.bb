SUMMARY = "Shared library for fastjet-contrib"
DESCRIPTION = "This package provides the shared library for fastjet-contrib."
LICENSE = "GPL-2.0-only"

PV = "1.049"

RPM_NAME = "libfastjetcontribfragile-1.049-1.3.aarch64.rpm"
RPM_HASH = "ebb18549572816f1cab1595a09c2ab2a6773fdce9e8fe7f0c0b6ac1a8f55a2cef43b0c35e824785986cf4e8ddf6f1f642d0c4e897c201dfa193fa5f88c15f392"

RPROVIDES:${PN} += "libfastjetcontribfragile \
libfastjetcontribfragile(aarch-64) \
libfastjetcontribfragile.so()(64bit)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.1)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
