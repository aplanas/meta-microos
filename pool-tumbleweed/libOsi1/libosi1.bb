SUMMARY = "Shared Libraries for coin-or-Osi"
DESCRIPTION = "Osi (Open Solver Interface) provides an abstract base class to a generic \
linear programming (LP) solver, along with derived classes for specific \
solvers."
LICENSE = "EPL-2.0"

PV = "0.108.7"

RPM_NAME = "libOsi1-0.108.7-1.3.aarch64.rpm"
RPM_HASH = "5cfac6b30306b90d54f260140d4af8bb15eee92df8d403a2de369e090352c353a5d088bbb11ce12efd75922a0ae1915505e05450131b72581179b6d7a797c0e0"

RPROVIDES:${PN} += "libOsi.so.1 \
libOsi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libCoinUtils.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
