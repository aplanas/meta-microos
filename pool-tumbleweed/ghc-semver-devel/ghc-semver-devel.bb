SUMMARY = "Haskell semver library development files"
DESCRIPTION = "This package provides the Haskell semver library development files."
LICENSE = "MPL-2.0"

PV = "0.4.0.1"

RPM_NAME = "ghc-semver-devel-0.4.0.1-1.3.aarch64.rpm"
RPM_HASH = "7d7f26136dd316739151eea1fddff470d43df28e1d6d6bae1c6d712eebc53aacd2acf1f5a4ae307dac59d0aa80fb8d9e81f454e85d76cc2b742ee82060244dbf"

RPROVIDES:${PN} += "ghc-devel-semver-0.4.0.1-ExZNCX3NISc5JbXfrvXt6N \
ghc-semver-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-devel-base-4.17.1.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-devel-text-2.0.2 \
ghc-semver"

inherit rpm
