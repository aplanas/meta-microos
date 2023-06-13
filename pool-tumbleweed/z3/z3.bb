SUMMARY = "Theorem prover from Microsoft Research"
DESCRIPTION = "Z3 is a Satisfiability Modulo Theories (SMT) solver and integrates \
several decision procedures: Linear real and integer arithmetic, \
fixed-size bit vectors, uninterpreted functions, extensional arrays, \
quantifiers and model generation."
LICENSE = "MIT"

PV = "4.12.1"

RPM_NAME = "z3-4.12.1-1.3.aarch64.rpm"
RPM_HASH = "5719389a32333cd481f214ac861cb7c51a6ca032ae9894c0b7316362ee8037f290843c909184f58a891ab44fa099b0cea3548b5d6e1e704a711367f6dfbdf025"

RPROVIDES:${PN} += "z3 \
z3(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
