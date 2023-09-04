SUMMARY = "Haskell semver profiling library"
DESCRIPTION = "This package provides the Haskell semver profiling library."
LICENSE = "MPL-2.0"

PV = "0.4.0.1"

RPM_NAME = "ghc-semver-prof-0.4.0.1-1.9.aarch64.rpm"
RPM_HASH = "418a9b5a3b945b5d42fb30740fcef0f17f1e78649ca5018c08064fbd04d9067a35919b1563aaee0ead313de6583ff220ad7cc03328d31c0de82eddb2bdbce2e3"

RPROVIDES:${PN} += "ghc-prof-semver-0.4.0.1-7FEVHDXnoZsE6NqAZNLXlb \
ghc-semver-prof"

RDEPENDS:${PN} += "ghc-prof-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-prof-base-4.17.2.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-prof-text-2.0.2 \
ghc-semver-devel"

inherit rpm
