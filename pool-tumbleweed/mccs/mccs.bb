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

RPROVIDES:${PN} += "mccs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblpsolve55.so.0 \
libstdc++.so.6"

inherit rpm
