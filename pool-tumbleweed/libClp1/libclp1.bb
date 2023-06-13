SUMMARY = "Shared Libraries for coin-or-Clp"
DESCRIPTION = "Clp (Coin-or linear programming) is an open-source linear programming \
solver. It is primarily meant to be used as a callable library, but a \
basic, stand-alone executable version is also available."
LICENSE = "EPL-2.0"

PV = "1.17.7"

RPM_NAME = "libClp1-1.17.7-1.3.aarch64.rpm"
RPM_HASH = "946c04cf7b9fed69794cd46eadc9c6026910b1fa43bde67a96f0895402e75ad5364143b36fe713dd72bbe0bf6bd9b3bf37d6967e27b0fd65ef8e7112e7f836d1"

RPROVIDES:${PN} += "libClp.so.1()(64bit) \
libClp1 \
libClp1(aarch-64) \
libClpSolver.so.1()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libCoinUtils.so.3()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
