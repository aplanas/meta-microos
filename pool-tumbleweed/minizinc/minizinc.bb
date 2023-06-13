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

RPROVIDES:${PN} += "libmzn.so()(64bit) \
minizinc \
minizinc(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgecodedriver.so.51()(64bit) \
libgecodefloat.so.51()(64bit) \
libgecodeint.so.51()(64bit) \
libgecodekernel.so.51()(64bit) \
libgecodeminimodel.so.51()(64bit) \
libgecodesearch.so.51()(64bit) \
libgecodeset.so.51()(64bit) \
libgecodesupport.so.51()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.23)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.1)(64bit) \
libstdc++.so.6(CXXABI_1.3.11)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.2)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
