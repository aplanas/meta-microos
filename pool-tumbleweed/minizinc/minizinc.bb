SUMMARY = "A high-level constraint modelling language"
DESCRIPTION = "You can use MiniZinc to model constraint satisfaction and optimisation \
problems in a high-level, solver-independent way, taking advantage of \
a large library of pre-defined constraints. Your model is then \
compiled into FlatZinc, a solver input language that is understood \
by a wide range of solvers."
LICENSE = "MPL-2.0"

PV = "2.6.4"

RPM_NAME = "minizinc-2.6.4-1.5.aarch64.rpm"
RPM_HASH = "28c3c84ba5ed92af90db0e13260fc5fefe4a3d03cc97a0e58a0b33679dbb9230353f18ecdb76e66d41bf01d03a64a47b8e37aa8609eee1307be294fc931c8ab0"

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
