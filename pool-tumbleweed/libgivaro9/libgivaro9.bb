SUMMARY = "C++ library for arithmetic and algebraic computations"
DESCRIPTION = "Givaro is a C++ library for arithmetic and algebraic computations. \
 \
Its main features are implementations of the basic arithmetic of many \
mathematical entities: Primes fields, Extensions Fields, Finite \
Fields, Finite Rings, Polynomials, Algebraic numbers, Arbitrary \
precision integers and rationals. It also provides data structures \
and templated classes for the manipulation of basic algebraic \
objects, such as vectors, matrices (dense, sparse, structured), \
univariate polynomials (and therefore recursive multivariate). \
 \
It contains different program modules and is fully compatible with \
the LinBox linear algebra library and the KAAPI kernel for \
Adaptative, Asynchronous Parallel and Interactive programming."
LICENSE = "CECILL-B"

PV = "4.2.0"

RPM_NAME = "libgivaro9-4.2.0-2.1.aarch64.rpm"
RPM_HASH = "9b75defaf53ff26ba233e377c7b31e3461cd0a356c96b6d8f2a619cc6b187d9a79e4ec7c0e5f8cf507a333d75cf3e0ccc7c70d5eb24c7d40af6ca56ef9ee3152"

RPROVIDES:${PN} += "libgivaro.so.9()(64bit) \
libgivaro9 \
libgivaro9(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgmp.so.10()(64bit) \
libgmpxx.so.4()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
