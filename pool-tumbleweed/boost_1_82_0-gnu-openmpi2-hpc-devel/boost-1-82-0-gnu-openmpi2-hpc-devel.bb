SUMMARY = "Development package for Boost C++"
DESCRIPTION = "This package contains all that is needed to develop/compile \
applications that use the Boost C++ libraries. For documentation see \
the documentation packages (html, man or pdf)."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost_1_82_0-gnu-openmpi2-hpc-devel-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "01b97d89f0711d503b2b17c0591ddcf8d8478bdaf59262029aa4412489a98b803eebd5e67a7ac45c3efa6160cba0a7ebc19fe7960fcef4ab3594a51786423b04"

RPROVIDES:${PN} += "boost_1_82_0-gnu-openmpi2-hpc-devel \
boost_1_82_0-gnu-openmpi2-hpc-devel(aarch-64)"

RDEPENDS:${PN} += "boost_1_82_0-gnu-openmpi2-hpc \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
