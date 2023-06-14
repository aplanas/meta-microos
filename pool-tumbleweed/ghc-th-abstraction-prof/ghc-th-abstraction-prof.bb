SUMMARY = "Haskell th-abstraction profiling library"
DESCRIPTION = "This package provides the Haskell th-abstraction profiling library."
LICENSE = "ISC"

PV = "0.4.5.0"

RPM_NAME = "ghc-th-abstraction-prof-0.4.5.0-2.3.aarch64.rpm"
RPM_HASH = "76782b5da27ae39fee2920ec5e426523b6bea70db5e7c841e2fc99b049d3ce962163e98b1a69dbadb4f9c4e82851c3efa1bb02a907340cc11eb7b2cd71176ddf"

RPROVIDES:${PN} += "ghc-prof-th-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT \
ghc-th-abstraction-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-ghc-prim-0.9.0 \
ghc-prof-template-haskell-2.19.0.0 \
ghc-th-abstraction-devel"

inherit rpm
