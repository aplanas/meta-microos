SUMMARY = "Multi Criteria CUDF Solver"
DESCRIPTION = "mccs (which stands for Multi Criteria CUDF Solver) is a CUDF problem solver \
developed at UNS during the European MANCOOSI project. mccs take as input a \
CUDF problem and computes the best solution according to a set of criteria. \
It relies on a Integer Programming solver or a Pseudo Boolean solver to achieve \
its task. mccs can use a wide set of underlying solvers like Cplex, Gurobi, \
Lpsolver, Glpk, CbC, SCIP or WBO."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "mccs-1.1-2.8.aarch64.rpm"
RPM_HASH = "831585a172b3b337dd42bc2407bf6ef49cca4cc4762f9d669c6264242ed1812012b7396599bc66fc71933d3437c9b3234de2442abc863163adfce46eef799682"

RPROVIDES:${PN} += "mccs \
mccs(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
liblpsolve55.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.10)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
