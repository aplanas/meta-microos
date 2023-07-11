SUMMARY = "Ceres Solver header files"
DESCRIPTION = "Ceres Solver is a C++ library for modeling and solving large, \
complicated optimization problems. It can be used to solve Non-linear Least \
Squares problems with bounds constraints and general unconstrained optimization \
problems. \
 \
This package is built with Eigen only."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "libceres-devel-2.1.0-1.5.aarch64.rpm"
RPM_HASH = "80f7df772340ed4ded1a5a498b71cb3ed7c1fa459a04b0dc45dfcf41a0d70eaae4744b4d99ff5118c69832545361ce9a8ada18cdb768528d91c3447ca6b1c637"

RPROVIDES:${PN} += "cmake-Ceres \
libceres-devel"

RDEPENDS:${PN} += "glog-devel \
libceres3"

inherit rpm
