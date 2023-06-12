SUMMARY = "Shared Libraries for coin-or-Osi"
DESCRIPTION = "Osi (Open Solver Interface) provides an abstract base class to a generic \
linear programming (LP) solver, along with derived classes for specific \
solvers."
LICENSE = "EPL-2.0"

PV = "0.108.7"

RPM_NAME = "libOsi1-0.108.7-1.3.aarch64.rpm"
RPM_HASH = "5cfac6b30306b90d54f260140d4af8bb15eee92df8d403a2de369e090352c353a5d088bbb11ce12efd75922a0ae1915505e05450131b72581179b6d7a797c0e0"

RPROVIDES:${PN} += "libOsi.so.1()(64bit) \
libOsi1 \
libOsi1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libCoinUtils.so.3()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
