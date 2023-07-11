SUMMARY = "Theorem prover from Microsoft Research"
DESCRIPTION = "Z3 is a Satisfiability Modulo Theories (SMT) solver and integrates \
several decision procedures: Linear real and integer arithmetic, \
fixed-size bit vectors, uninterpreted functions, extensional arrays, \
quantifiers and model generation."
LICENSE = "MIT"

PV = "4.12.2"

RPM_NAME = "z3-4.12.2-1.1.aarch64.rpm"
RPM_HASH = "e05044d2969e112c659a7daad84069cd7a0187e99b3939c6ef70f2d3d99057e2d3e9aabef4c3b483138fea475499009e551360cd753325666a9a02b6d2f890ce"

RPROVIDES:${PN} += "z3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
