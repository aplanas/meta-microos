SUMMARY = "Haskell timezone-olson profiling library"
DESCRIPTION = "This package provides the Haskell timezone-olson profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-timezone-olson-prof-0.2.1-2.6.aarch64.rpm"
RPM_HASH = "065960c86f4b7770e77cb0716ff2e5ac7e04711b404414b976919fe6a3b77dc75bab253fe8e56ffec2c2f349a7e091c27c434e5d6d973336d6817e83ff677ea2"

RPROVIDES:${PN} += "ghc-prof-timezone-olson-0.2.1-GQQU9hvoQrwIpL0LHxa8ME \
ghc-timezone-olson-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-extensible-exceptions-0.1.1.4-ItoFoaqbPMuGIlsBr6VhGY \
ghc-prof-time-1.12.2 \
ghc-prof-timezone-series-0.1.13-52HOboQTQ6c9WNazbzYdiK \
ghc-timezone-olson-devel"

inherit rpm
