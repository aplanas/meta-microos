SUMMARY = "Haskell tasty-quickcheck library development files"
DESCRIPTION = "This package provides the Haskell tasty-quickcheck library development \
files."
LICENSE = "MIT"

PV = "0.10.2"

RPM_NAME = "ghc-tasty-quickcheck-devel-0.10.2-2.3.aarch64.rpm"
RPM_HASH = "debf29c4142424bf0e2684f8beb432f0bc3535c08f7a4897b33f7deeafc7276bde34f56066b68771d7b7b80db12d8d422fd7d9d6e7477b847b400cfc46b92c14"

RPROVIDES:${PN} += "ghc-devel-tasty-quickcheck-0.10.2-9BXtwYsGN94LXf5I8sMsq \
ghc-tasty-quickcheck-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-QuickCheck-2.14.3-6dq2izV8oSq1BobaDA598X \
ghc-devel-base-4.17.1.0 \
ghc-devel-optparse-applicative-0.18.1.0-EzAv0xKPJOa274kXT9Znff \
ghc-devel-random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o \
ghc-devel-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-devel-tasty-1.4.3-18zApXOtbThAhmaMCCQRWB \
ghc-tasty-quickcheck"

inherit rpm
