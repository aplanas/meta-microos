SUMMARY = "Multi Criteria CUDF Solver"
DESCRIPTION = "mccs (which stands for Multi Criteria CUDF Solver) is a CUDF problem solver \
developed at UNS during the European MANCOOSI project. mccs take as input a \
CUDF problem and computes the best solution according to a set of criteria. \
It relies on a Integer Programming solver or a Pseudo Boolean solver to achieve \
its task. mccs can use a wide set of underlying solvers like Cplex, Gurobi, \
Lpsolver, Glpk, CbC, SCIP or WBO."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "mccs-1.1-2.9.aarch64.rpm"
RPM_HASH = "17aae4ce767c7ab1d26762f087a2e586fa9591748639100400a0c484c92f103655824b353fb40784f0a55c7cd1a5d78adb025c1a46534b5086669a0e77fdd5fe"

RPROVIDES:${PN} += "mccs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblpsolve55.so.0 \
libstdc++.so.6"

inherit rpm
