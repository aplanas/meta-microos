SUMMARY = "COIN-OR Open Solver Interface for CLP"
DESCRIPTION = "Clp (Coin-or linear programming) is an open-source linear programming \
solver. It is primarily meant to be used as a callable library, but a \
basic, stand-alone executable version is also available."
LICENSE = "EPL-2.0"

PV = "1.17.7"

RPM_NAME = "libOsiClp1-1.17.7-1.3.aarch64.rpm"
RPM_HASH = "0c58b4ea1d9dec0a2e77a850e3e17c4bd00948e93045235197922a304bf0f07dd2223eea1c6bd6b38bfaedaf3d4d70c4d32177b1dd2a86a18229fad6fb906e86"

RPROVIDES:${PN} += "libOsiClp.so.1 \
libOsiClp1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libClp.so.1 \
libCoinUtils.so.3 \
libOsi.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
