SUMMARY = "Haskell timezone-olson library development files"
DESCRIPTION = "This package provides the Haskell timezone-olson library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-timezone-olson-devel-0.2.1-2.3.aarch64.rpm"
RPM_HASH = "6eb71493fe0f01333e3b8b7abab6355fe0484236e6b0f2b6f558a2aa2e667c5ee393cb6e318fcf7eea3a62e940f1acff0ae6f87d6932ae2616fa853d03ec189e"

RPROVIDES:${PN} += "ghc-devel-timezone-olson-0.2.1-GQQU9hvoQrwIpL0LHxa8ME \
ghc-timezone-olson-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-extensible-exceptions-0.1.1.4-ItoFoaqbPMuGIlsBr6VhGY \
ghc-devel-time-1.12.2 \
ghc-devel-timezone-series-0.1.13-52HOboQTQ6c9WNazbzYdiK \
ghc-timezone-olson"

inherit rpm
