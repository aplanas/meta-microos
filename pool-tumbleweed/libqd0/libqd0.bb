SUMMARY = "A library for nonlinear optimization"
DESCRIPTION = "qd provides numeric types of twice the precision of IEEE double \
(106 mantissa bits, or approximately 32 decimal digits) and four \
times the precision of IEEE double (212 mantissa bits, or approximately \
64 decimal digits).  Due to features such as operator and function \
overloading, these facilities can be utilized with only minor modifications \
to conventional C++ and Fortran-90 programs."
LICENSE = "BSD-3-Clause-LBNL"

PV = "2.3.23"

RPM_NAME = "libqd0-2.3.23-1.2.aarch64.rpm"
RPM_HASH = "8a71967f1b23a381edc1cb6b901bf7611c450af83674f61c4d57fc125b8ef3f8f0bfc37ba31fba5628f51d6010deeae34638498a51da133328e9af979227e7f9"

RPROVIDES:${PN} += "libqd.so.0()(64bit) \
libqd0 \
libqd0(aarch-64) \
libqd_f_main.so.0()(64bit) \
libqdmod.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
