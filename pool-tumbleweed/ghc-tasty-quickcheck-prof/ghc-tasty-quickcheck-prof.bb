SUMMARY = "Haskell tasty-quickcheck profiling library"
DESCRIPTION = "This package provides the Haskell tasty-quickcheck profiling library."
LICENSE = "MIT"

PV = "0.10.2"

RPM_NAME = "ghc-tasty-quickcheck-prof-0.10.2-2.2.aarch64.rpm"
RPM_HASH = "6b8bda931a56186e2a91f780a0e32d45fae8931a6f0920c4a0b2f9ef4ffd2d4e46d00ae24be4c1d96b7325cb1ac5459df54587f815901c0e1fb9a44e4c605c4a"

RPROVIDES:${PN} += "ghc-prof-tasty-quickcheck-0.10.2-35bOuuNPLunDPSjWY1CT1e \
ghc-tasty-quickcheck-prof"

RDEPENDS:${PN} += "ghc-prof-QuickCheck-2.14.2-Ifslnzw9cpLJMSBGXVUlx6 \
ghc-prof-base-4.17.1.0 \
ghc-prof-optparse-applicative-0.17.0.0-FKlMMFcKpwNJEuIq63gWOB \
ghc-prof-random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o \
ghc-prof-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-prof-tasty-1.4.3-FhQLnMluiBU5Fwwb1Rsznz \
ghc-tasty-quickcheck-devel"

inherit rpm
