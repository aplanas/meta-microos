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

RPM_NAME = "stp-2.3.3+20220915-1.4.aarch64.rpm"
RPM_HASH = "00c4d6c9dee0d523ac55138d9e1857d7df5e0089d48d33c4c456e6d183383f997352005cf85350f186413ddf8e6d70d5e74fdcd66ce12d8d8f3fabbdd7a33f89"

RPROVIDES:${PN} += "stp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-program-options.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libstp.so.2.3"

inherit rpm
