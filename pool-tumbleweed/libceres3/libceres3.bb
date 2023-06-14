SUMMARY = "Ceres Solver shared library"
DESCRIPTION = "Ceres Solver is a C++ library for modeling and solving large, \
complicated optimization problems. It can be used to solve Non-linear Least \
Squares problems with bounds constraints and general unconstrained optimization \
problems. \
 \
This package is built with Eigen only."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "libceres3-2.1.0-1.4.aarch64.rpm"
RPM_HASH = "1653c068816e88152a331165d3320f10031429a48bd106ca3431efaa2e0ebf5a8d0e025fb29ffe855938adfc57fa802d7f1602878f215255d7e2ea736ff7c837"

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
