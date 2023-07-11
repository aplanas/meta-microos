SUMMARY = "Haskell tasty-quickcheck profiling library"
DESCRIPTION = "This package provides the Haskell tasty-quickcheck profiling library."
LICENSE = "MIT"

PV = "0.10.2"

RPM_NAME = "ghc-tasty-quickcheck-prof-0.10.2-2.3.aarch64.rpm"
RPM_HASH = "c2cbe6f8ffc2b8bea8a66bb2af414d04f7258ed82e44d4c26fb7efdfae2100f4da1797d2791524ea2b858d380b1c0e22b45bd634829f311e483c77342905ef5e"

RPROVIDES:${PN} += "ghc-prof-tasty-quickcheck-0.10.2-9BXtwYsGN94LXf5I8sMsq \
ghc-tasty-quickcheck-prof"

RDEPENDS:${PN} += "ghc-prof-QuickCheck-2.14.3-6dq2izV8oSq1BobaDA598X \
ghc-prof-base-4.17.1.0 \
ghc-prof-optparse-applicative-0.18.1.0-EzAv0xKPJOa274kXT9Znff \
ghc-prof-random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o \
ghc-prof-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-prof-tasty-1.4.3-18zApXOtbThAhmaMCCQRWB \
ghc-tasty-quickcheck-devel"

inherit rpm
