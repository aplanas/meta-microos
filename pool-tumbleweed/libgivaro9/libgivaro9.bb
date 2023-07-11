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

RPM_NAME = "libgivaro9-4.2.0-2.2.aarch64.rpm"
RPM_HASH = "d64375ec650e8d4d5479c5bb1b35f5afab3a271b1911d78692ac8160930d457b4729d337fb823ce58f481ee8cbd150eab0504366942b5846bba44ac8f05a9e9b"

RPROVIDES:${PN} += "libgivaro.so.9 \
libgivaro9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libgmpxx.so.4 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
