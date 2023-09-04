SUMMARY = "Haskell tasty-quickcheck profiling library"
DESCRIPTION = "This package provides the Haskell tasty-quickcheck profiling library."
LICENSE = "MIT"

PV = "0.10.2"

RPM_NAME = "ghc-tasty-quickcheck-prof-0.10.2-2.5.aarch64.rpm"
RPM_HASH = "132ad998eac2688acbd480cd216b2ded43df3841dae223fb9641364d2517d3012564ddfcc7ed0c8f5058a3b63f840a1dc5c8ae1fda17738953c74a974e287006"

RPROVIDES:${PN} += "ghc-prof-tasty-quickcheck-0.10.2-2UFPyzLXBXCItwO8bufmfg \
ghc-tasty-quickcheck-prof"

RDEPENDS:${PN} += "ghc-prof-QuickCheck-2.14.3-EdzpnPTYr1uH7EoNAOpgI8 \
ghc-prof-base-4.17.2.0 \
ghc-prof-optparse-applicative-0.18.1.0-7FhZIXYdOMtK1gl2fqKmzm \
ghc-prof-random-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k \
ghc-prof-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-prof-tasty-1.4.3-EvDBAB3nA5D6U1ANfXkHR \
ghc-tasty-quickcheck-devel"

inherit rpm
