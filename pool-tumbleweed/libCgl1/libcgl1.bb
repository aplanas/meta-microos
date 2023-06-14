SUMMARY = "Shared Libraries for coin-or-Cgl"
DESCRIPTION = "The COIN-OR Cut Generation Library (Cgl) is a collection of cut generators \
that can be used with other COIN-OR packages that make use of cuts, such as, \
among others, the linear solver Clp or the mixed integer linear programming \
solvers Cbc or BCP"
LICENSE = "EPL-2.0"

PV = "0.60.6"

RPM_NAME = "libCgl1-0.60.6-1.3.aarch64.rpm"
RPM_HASH = "37cd70ca429325b61311c4bf398184c163aa2e3a969e49575d66174da27da50a2693920da45ecdbcbfa97e7efb13298bf078165db345dd0ff56b6f631bca75db"

RPROVIDES:${PN} += "libCgl.so.1 \
libCgl1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libClp.so.1 \
libCoinUtils.so.3 \
libOsi.so.1 \
libOsiClp.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
