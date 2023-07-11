SUMMARY = "Ceres Solver shared library"
DESCRIPTION = "Ceres Solver is a C++ library for modeling and solving large, \
complicated optimization problems. It can be used to solve Non-linear Least \
Squares problems with bounds constraints and general unconstrained optimization \
problems. \
 \
This package is built with Eigen only."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "libceres3-2.1.0-1.5.aarch64.rpm"
RPM_HASH = "9da1bd70fa266ad5601ec412b2ffb1d2ed2806c535ea3918c2b6f20ae464aab21ac725df103a380caca97d19a3e87a7d69136e0cb0c6fdffae57892ee466516a"

RPROVIDES:${PN} += "libceres.so.3 \
libceres3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcholmod.so.3 \
libcxsparse.so.3 \
libgcc-s.so.1 \
libglog.so.0 \
libm.so.6 \
libopenblas.so.0 \
libspqr.so.2 \
libstdc++.so.6"

inherit rpm
