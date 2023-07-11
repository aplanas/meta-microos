SUMMARY = "COIN-OR Open Solver Interface for CLP"
DESCRIPTION = "Clp (Coin-or linear programming) is an open-source linear programming \
solver. It is primarily meant to be used as a callable library, but a \
basic, stand-alone executable version is also available."
LICENSE = "EPL-2.0"

PV = "1.17.7"

RPM_NAME = "libOsiClp1-1.17.7-1.4.aarch64.rpm"
RPM_HASH = "b26ab8d9f1d6db701b1c84fb806576b27c2ab248de2abc6d083b30194f271d600e56d9422ec1993f875e8129113ba67d62df28012fb8ab2b47fdd16b738d8e7f"

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
