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

RPM_NAME = "libsymmetrica2-3.0.1-1.11.aarch64.rpm"
RPM_HASH = "005da6181de9d9bdadb306fe67a8fe167f29a0475bfd8f23cb19e667cba9f21fdcd03be330b033e2b0b40d59c3fb32a5bb8ae956b15f88411fac7bffb26cf502"

RPROVIDES:${PN} += "libsymmetrica.so.2 \
libsymmetrica2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
