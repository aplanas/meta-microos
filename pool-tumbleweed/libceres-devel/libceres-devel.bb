SUMMARY = "Ceres Solver header files"
DESCRIPTION = "Ceres Solver is a C++ library for modeling and solving large, \
complicated optimization problems. It can be used to solve Non-linear Least \
Squares problems with bounds constraints and general unconstrained optimization \
problems. \
 \
This package is built with Eigen only."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "libceres-devel-2.1.0-1.4.aarch64.rpm"
RPM_HASH = "f347b57f8bdddd7d4f3a9ddd58f75cd1673a2f81a2af0bea8f07ef9d2e8a3df7c1dcbb7b971ab9a51a6052b979d39f745da179953ffee6f1a4ebf370c86db869"

RPROVIDES:${PN} += "cmake(Ceres) \
libceres-devel \
libceres-devel(aarch-64)"

RDEPENDS:${PN} += "glog-devel \
libceres3"

inherit rpm
