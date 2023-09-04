SUMMARY = "Haskell semver library development files"
DESCRIPTION = "This package provides the Haskell semver library development files."
LICENSE = "MPL-2.0"

PV = "0.4.0.1"

RPM_NAME = "ghc-semver-devel-0.4.0.1-1.9.aarch64.rpm"
RPM_HASH = "038aaecd1c0f86c97ab1d40299cfa4a4679f917a70ff6ff495cc94836479956a1a7d6edb225a64eb72e9fc14bb26cfc0f087e7d308fe60a8c2f8dab295014874"

RPROVIDES:${PN} += "ghc-devel-semver-0.4.0.1-7FEVHDXnoZsE6NqAZNLXlb \
ghc-semver-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-devel-base-4.17.2.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-devel-text-2.0.2 \
ghc-semver"

inherit rpm
