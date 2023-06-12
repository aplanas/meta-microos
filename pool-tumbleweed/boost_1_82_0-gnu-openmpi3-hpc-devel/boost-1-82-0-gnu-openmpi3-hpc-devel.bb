SUMMARY = "Development package for Boost C++"
DESCRIPTION = "This package contains all that is needed to develop/compile \
applications that use the Boost C++ libraries. For documentation see \
the documentation packages (html, man or pdf)."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost_1_82_0-gnu-openmpi3-hpc-devel-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "5e620de20f5925da7663d20b69d9904f9daff3471d82f984e9a07eb61bdd0277204ce042be4dba4afbcf81fbba72fae816597527406191f82c81144488eb569d"

RPROVIDES:${PN} += "boost_1_82_0-gnu-openmpi3-hpc-devel \
boost_1_82_0-gnu-openmpi3-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "boost_1_82_0-gnu-openmpi3-hpc \
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
