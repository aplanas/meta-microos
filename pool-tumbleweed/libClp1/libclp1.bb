SUMMARY = "Shared Libraries for coin-or-Clp"
DESCRIPTION = "Clp (Coin-or linear programming) is an open-source linear programming \
solver. It is primarily meant to be used as a callable library, but a \
basic, stand-alone executable version is also available."
LICENSE = "EPL-2.0"

PV = "1.17.7"

RPM_NAME = "libClp1-1.17.7-1.4.aarch64.rpm"
RPM_HASH = "251b1a021f6ae0b54115c50e2f1c52c9af2aec80348d17701d0a0375fe05260e645836c446f8006e964cedee95540ea871adf541c0937adfa9527b917d410a65"

RPROVIDES:${PN} += "libClp.so.1 \
libClp1 \
libClpSolver.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libCoinUtils.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
