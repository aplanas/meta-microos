SUMMARY = "Haskell semver profiling library"
DESCRIPTION = "This package provides the Haskell semver profiling library."
LICENSE = "MPL-2.0"

PV = "0.4.0.1"

RPM_NAME = "ghc-semver-prof-0.4.0.1-1.3.aarch64.rpm"
RPM_HASH = "89f93dd3d3c6a1c3ff1b2795404a7152e781c1d16a2ecb24cc60ea4a73497bd2c45464f47fc191296a6328086e43d18e9b593e49a1824af0b9397afb4b1b3509"

RPROVIDES:${PN} += "ghc-prof-semver-0.4.0.1-ExZNCX3NISc5JbXfrvXt6N \
ghc-semver-prof"

RDEPENDS:${PN} += "ghc-prof-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-prof-base-4.17.1.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-prof-text-2.0.2 \
ghc-semver-devel"

inherit rpm
