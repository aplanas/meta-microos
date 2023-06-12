SUMMARY = "Shared Libraries for coin-or-Cgl"
DESCRIPTION = "The COIN-OR Cut Generation Library (Cgl) is a collection of cut generators \
that can be used with other COIN-OR packages that make use of cuts, such as, \
among others, the linear solver Clp or the mixed integer linear programming \
solvers Cbc or BCP"
LICENSE = "EPL-2.0"

PV = "0.60.6"

RPM_NAME = "libCgl1-0.60.6-1.3.aarch64.rpm"
RPM_HASH = "37cd70ca429325b61311c4bf398184c163aa2e3a969e49575d66174da27da50a2693920da45ecdbcbfa97e7efb13298bf078165db345dd0ff56b6f631bca75db"

RPROVIDES:${PN} += "libCgl.so.1()(64bit) \
libCgl1 \
libCgl1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libClp.so.1()(64bit) \
libCoinUtils.so.3()(64bit) \
libOsi.so.1()(64bit) \
libOsiClp.so.1()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
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
