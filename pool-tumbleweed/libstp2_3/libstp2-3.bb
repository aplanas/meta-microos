SUMMARY = "Constraint Solver"
DESCRIPTION = "STP is an efficient decision procedure for the validity (or satisfiability) of \
formulas from a quantifier-free many-sorted theory of fixed-width bitvectors \
and (non-extensional) one-dimensional arrays. The functions in STP's input \
language include concatenation, extraction, left/right shift, sign-extension, \
unary minus, addition, multiplication, (signed) modulo/division, bitwise \
Boolean operations, if-then-else terms, and array reads and writes. The \
predicates in the language include equality and (signed) comparators between \
bitvector terms."
LICENSE = "MIT"

PV = "2.3.3+20220915"

RPM_NAME = "libstp2_3-2.3.3+20220915-1.3.aarch64.rpm"
RPM_HASH = "6c3f1da7edb59200283f441fc5d0169dda8afb2af1fcf3e2102f73240d70a7cd6614793b727e0171db2a0a2de76716e6f21410ee272514eac4bfd13db650abd8"

RPROVIDES:${PN} += "libstp.so.2.3()(64bit) \
libstp2_3 \
libstp2_3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libminisat.so.2()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
