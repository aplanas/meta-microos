SUMMARY = "A high-level constraint modelling language"
DESCRIPTION = "You can use MiniZinc to model constraint satisfaction and optimisation \
problems in a high-level, solver-independent way, taking advantage of \
a large library of pre-defined constraints. Your model is then \
compiled into FlatZinc, a solver input language that is understood \
by a wide range of solvers."
LICENSE = "MPL-2.0"

PV = "2.6.4"

RPM_NAME = "minizinc-2.6.4-1.4.aarch64.rpm"
RPM_HASH = "ed7b8c4f88a01699fa8455124d303dc9228bc87a4c721a85f75c43dc6302d509330297013d3c831e59980a063b0b4627cb568142d60f9c2b1ee254711066ee9f"

RPROVIDES:${PN} += "libmzn.so \
minizinc"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgecodedriver.so.51 \
libgecodefloat.so.51 \
libgecodeint.so.51 \
libgecodekernel.so.51 \
libgecodeminimodel.so.51 \
libgecodesearch.so.51 \
libgecodeset.so.51 \
libgecodesupport.so.51 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
