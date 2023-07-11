SUMMARY = "C library for group theory"
DESCRIPTION = "Symmetrica is a C library with routines for the following applications, among \
many others: \
 \
  * ordinary representation theory of the symmetric group and related groups \
  * ordinary representation theory of the classical groups \
  * modular representation theory of the symmetric group \
  * projective representation theory of the symmetric group \
  * combinatorics of tableaux \
  * symmetric functions and polynomials \
  * commutative and non commutative Schubert polynomials \
  * operations of finite groups \
  * ordinary representation theory of Hecke algebras of type An"
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "libsymmetrica2-3.0.1-1.12.aarch64.rpm"
RPM_HASH = "a35f09af056fc9a85e43b44cdf043a5bc4cc3683146f8f2ffd1987600977f6d76814e0c5d6b9400c7893e5db95eeb97b8b0c51e23313d91e0e961abbd5fdefdd"

RPROVIDES:${PN} += "libsymmetrica.so.2 \
libsymmetrica2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
