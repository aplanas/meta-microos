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

RPM_NAME = "libstp2_3-2.3.3+20220915-1.4.aarch64.rpm"
RPM_HASH = "b4e1fa7ab4a34889418785290fed2f22034e9edbe179ac81afb7589689ffe47fb6f019ac67718cfb5251d36857fe90cebfdd9e3d498ba4f8800de4a293101971"

RPROVIDES:${PN} += "libstp.so.2.3 \
libstp2-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libminisat.so.2 \
libstdc++.so.6"

inherit rpm
