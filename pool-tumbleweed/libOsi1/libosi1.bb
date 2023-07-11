SUMMARY = "Shared Libraries for coin-or-Osi"
DESCRIPTION = "Osi (Open Solver Interface) provides an abstract base class to a generic \
linear programming (LP) solver, along with derived classes for specific \
solvers."
LICENSE = "EPL-2.0"

PV = "0.108.7"

RPM_NAME = "libOsi1-0.108.7-1.4.aarch64.rpm"
RPM_HASH = "4bb534ac48319c1e29acf90c574a57ed24cb9a81dc9a7c968c2a860e2fe62653b4ed806436301b8ac9817054d5b9ce0efd4ab6ead5b1f050ad3a7f83f2dcbd36"

RPROVIDES:${PN} += "libOsi.so.1 \
libOsi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libCoinUtils.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
