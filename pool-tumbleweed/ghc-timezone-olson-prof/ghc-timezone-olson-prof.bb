SUMMARY = "Haskell timezone-olson profiling library"
DESCRIPTION = "This package provides the Haskell timezone-olson profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-timezone-olson-prof-0.2.1-2.3.aarch64.rpm"
RPM_HASH = "2c39d2c7d1a95adbf3c2c92b146792f220c037154f633e056c3924d0569942c6f7aa1e7aed0e15845b0eae040421022daa2d49db36ff95cbb9f23648afb67900"

RPROVIDES:${PN} += "ghc-prof(timezone-olson-0.2.1-GQQU9hvoQrwIpL0LHxa8ME) \
ghc-timezone-olson-prof \
ghc-timezone-olson-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-prof(binary-0.8.9.1) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(extensible-exceptions-0.1.1.4-ItoFoaqbPMuGIlsBr6VhGY) \
ghc-prof(time-1.12.2) \
ghc-prof(timezone-series-0.1.13-52HOboQTQ6c9WNazbzYdiK) \
ghc-timezone-olson-devel"

inherit rpm
