SUMMARY = "COIN-OR Branch-and-Cut solver"
DESCRIPTION = "Cbc (Coin-or branch and cut) is an open-source mixed integer linear \
programming solver written in C++. It can be used as a callable \
library or using a stand-alone executable. It can be used in a wide \
variety of ways through various modeling systems, packages, etc."
LICENSE = "EPL-2.0"

PV = "2.10.8"

RPM_NAME = "coin-or-Cbc-2.10.8-1.3.aarch64.rpm"
RPM_HASH = "fcefcefbee416d60891ed35bb8e6612265caf76c8965eff7df3be048fb3f76e3e7e69c744405f19d765e8946b805f820373367c8c5338fa46d0cc4f64f458c2f"

RPROVIDES:${PN} += "coin-or-Cbc \
coin-or-Cbc(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libCbc.so.3()(64bit) \
libCbcSolver.so.3()(64bit) \
libOsiClp.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit)"

inherit rpm
