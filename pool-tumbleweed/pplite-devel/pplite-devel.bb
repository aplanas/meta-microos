SUMMARY = "Headers and generators for pplite"
DESCRIPTION = "PPLite is a C++ library implementing the abstract domain of convex polyhedra, \
to be used in tools for static analysis and verification. \
The main characteristics of PPLite: \
 \
  * Both closed and NNC rational convex polyhedra are supported. \
  * Exact computations are based on FLINT."
LICENSE = "GPL-3.0-or-later"

PV = "0.7"

RPM_NAME = "pplite-devel-0.7-1.9.aarch64.rpm"
RPM_HASH = "2e49a47f74344516f2c0e97fe3895a1d523a61f3c74a02721d8af86af0b3d51f6d495936c1ad31e6cd39a68f21ffdaee0102a5c51dca9d1bae30b1de1405181c"

RPROVIDES:${PN} += "pplite-devel \
pplite-devel(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libflint.so.17()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgmp.so.10()(64bit) \
libgmpxx.so.4()(64bit) \
libpplite.so.1()(64bit) \
libpplite1 \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
