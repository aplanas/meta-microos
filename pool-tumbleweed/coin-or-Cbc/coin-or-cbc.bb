SUMMARY = "COIN-OR Branch-and-Cut solver"
DESCRIPTION = "Cbc (Coin-or branch and cut) is an open-source mixed integer linear \
programming solver written in C++. It can be used as a callable \
library or using a stand-alone executable. It can be used in a wide \
variety of ways through various modeling systems, packages, etc."
LICENSE = "EPL-2.0"

PV = "2.10.8"

RPM_NAME = "coin-or-Cbc-2.10.8-1.4.aarch64.rpm"
RPM_HASH = "692eed10a7cf598905d002d380404f4dec310da491e7f5e64f8226b68ec8b7d5b90ae4f184fb9a8d1379ece8ad1001ee761d610f8fe97682f30cff08cb39cffd"

RPROVIDES:${PN} += "coin-or-Cbc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libCbc.so.3 \
libCbcSolver.so.3 \
libOsiClp.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
