SUMMARY = "Haskell css-text profiling library"
DESCRIPTION = "This package provides the Haskell css-text profiling library."
LICENSE = "MIT"

PV = "0.1.3.0"

RPM_NAME = "ghc-css-text-prof-0.1.3.0-4.9.aarch64.rpm"
RPM_HASH = "ad7165c1b5c9a28d7c56e67b3b22155f80aebe6b0ea7e0c7775d452beaa40741386a33b8c57d5befc2307f6f2b97f0cfce7ebabb7735a08834948f92e8c306ec"

RPROVIDES:${PN} += "ghc-css-text-prof \
ghc-prof-css-text-0.1.3.0-8klVmv0TGJS6WEADR2StQO"

RDEPENDS:${PN} += "ghc-css-text-devel \
ghc-prof-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-prof-base-4.17.2.0 \
ghc-prof-text-2.0.2"

inherit rpm
