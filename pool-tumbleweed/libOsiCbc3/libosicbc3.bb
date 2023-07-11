SUMMARY = "COIN-OR Open Solver Interface for Cbc"
DESCRIPTION = "Cbc (Coin-or branch and cut) is an open-source mixed integer linear \
programming solver written in C++. It can be used as a callable \
library or using a stand-alone executable. It can be used in a wide \
variety of ways through various modeling systems, packages, etc."
LICENSE = "EPL-2.0"

PV = "2.10.8"

RPM_NAME = "libOsiCbc3-2.10.8-1.4.aarch64.rpm"
RPM_HASH = "b62f2d841f5f5e45b07277827a1cc12c6a45c6adf213de1a3b7aa8b60c1e053d1b2c43da5bb41402d65bde690892b8f1f907d88cedd46ac65556bb707a557c94"

RPROVIDES:${PN} += "libOsiCbc.so.3 \
libOsiCbc3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libCbc.so.3 \
libCoinUtils.so.3 \
libOsi.so.1 \
libOsiClp.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
