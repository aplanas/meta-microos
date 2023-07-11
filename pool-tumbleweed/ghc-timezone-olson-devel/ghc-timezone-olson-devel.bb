SUMMARY = "Haskell timezone-olson library development files"
DESCRIPTION = "This package provides the Haskell timezone-olson library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-timezone-olson-devel-0.2.1-2.6.aarch64.rpm"
RPM_HASH = "ec3dfbb66680ffac16ccf425b14bc3b2a2f674be3766bc133562d05bc14e7b093f666174fbd5b1927c931a64fe6272bc93230296de7eb30271f49b1d0af34e3d"

RPROVIDES:${PN} += "ghc-devel-timezone-olson-0.2.1-GQQU9hvoQrwIpL0LHxa8ME \
ghc-timezone-olson-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-extensible-exceptions-0.1.1.4-ItoFoaqbPMuGIlsBr6VhGY \
ghc-devel-time-1.12.2 \
ghc-devel-timezone-series-0.1.13-52HOboQTQ6c9WNazbzYdiK \
ghc-timezone-olson"

inherit rpm
