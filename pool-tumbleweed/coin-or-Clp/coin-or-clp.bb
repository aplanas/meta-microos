SUMMARY = "COIN-OR Linear Programming Solver"
DESCRIPTION = "Clp (Coin-or linear programming) is an open-source linear programming \
solver. It is primarily meant to be used as a callable library, but a \
basic, stand-alone executable version is also available."
LICENSE = "EPL-2.0"

PV = "1.17.7"

RPM_NAME = "coin-or-Clp-1.17.7-1.4.aarch64.rpm"
RPM_HASH = "452646a4af9a9fc524074bf4f81293def9492a9bed8ff38486644204332b1a66691bbcbe9587eb335220444dcd8869f4e1c01155b4204d2eac0683685fcd5f49"

RPROVIDES:${PN} += "coin-or-Clp"

RDEPENDS:${PN} += "libClp.so.1 \
libClpSolver.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
