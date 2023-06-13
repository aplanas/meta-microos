SUMMARY = "Computation on Coxeter groups"
DESCRIPTION = "The Coxeter 3 C++ library can be used to do computation on and with \
 \
  * General Coxeter groups, implemented through the combinatorics of \
    reduced words; \
  * Reduced expression and normal form computations; \
  * Bruhat ordering; \
  * Ordinary Kazhdan-Lusztig polynomials; \
  * Kazhdan-Lusztig polynomials with unequal parameters; \
  * Inverse Kazhdan-Lusztig polynomials; \
  * Cells and W-graphs;"
LICENSE = "GPL-2.0-or-later"

PV = "3.1+git7"

RPM_NAME = "coxeter-3.1+git7-1.11.aarch64.rpm"
RPM_HASH = "e4beed23f7b15fc1338a3f3a77116259fcc52e058296ae29ca7369ed48e047f04dcca8010c47d0914dd256c2f1f4d5a35856b4687ad816eeec5b8f3251f3b3f9"

RPROVIDES:${PN} += "coxeter \
coxeter(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit)"

inherit rpm
