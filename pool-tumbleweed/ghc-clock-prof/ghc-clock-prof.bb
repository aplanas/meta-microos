SUMMARY = "Haskell clock profiling library"
DESCRIPTION = "This package provides the Haskell clock profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.8.4"

RPM_NAME = "ghc-clock-prof-0.8.4-1.1.aarch64.rpm"
RPM_HASH = "8bdff35c2c55891eadda25328fd06f53e651a2553d9604ee4c1652d3aefbc0e830bd5488d9d7d1224ba659d1d989f736559ee7101c1cf78e466ee6f1ed9d4b22"

RPROVIDES:${PN} += "ghc-clock-prof \
ghc-prof-clock-0.8.4-Kk7SFw4SNhZ8ktwfjRIPil"

RDEPENDS:${PN} += "ghc-clock-devel \
ghc-prof-base-4.17.1.0"

inherit rpm
