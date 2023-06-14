SUMMARY = "COIN-OR Linear Programming Solver"
DESCRIPTION = "Clp (Coin-or linear programming) is an open-source linear programming \
solver. It is primarily meant to be used as a callable library, but a \
basic, stand-alone executable version is also available."
LICENSE = "EPL-2.0"

PV = "1.17.7"

RPM_NAME = "coin-or-Clp-1.17.7-1.3.aarch64.rpm"
RPM_HASH = "c22e8b1facc4d228c4116fdd4607a8b64b8cc14a04ef4118ae1eede284c627c616240f53d1f85f512fab5edbf9f38d55a895227197c0321eec04d988d1953831"

RPROVIDES:${PN} += "coin-or-Clp"

RDEPENDS:${PN} += "libClp.so.1 \
libClpSolver.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
