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

RPM_NAME = "stp-2.3.3+20220915-1.3.aarch64.rpm"
RPM_HASH = "6a11dee66a1b2f4ccab8f0ac265264460ac2dec2d873430b868abff377bb07d8417bb0d81c1da3cf10c5f70bab7c02a2f085271fead7582bb0a790aa4245f56e"

RPROVIDES:${PN} += "stp \
stp(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libboost_program_options.so.1.82.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libstp.so.2.3()(64bit)"

inherit rpm
