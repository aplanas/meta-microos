SUMMARY = "Haskell semver profiling library"
DESCRIPTION = "This package provides the Haskell semver profiling library."
LICENSE = "MPL-2.0"

PV = "0.4.0.1"

RPM_NAME = "ghc-semver-prof-0.4.0.1-1.6.aarch64.rpm"
RPM_HASH = "f68cc9da493d32afa286b301c084f9b393b9603ba464a2ab43b7dc0b8617e349d848c4807f305a9835b6007bc5653e1fe529f6d5a6804fbdaca744aca38b02ea"

RPROVIDES:${PN} += "ghc-prof-semver-0.4.0.1-ExZNCX3NISc5JbXfrvXt6N \
ghc-semver-prof"

RDEPENDS:${PN} += "ghc-prof-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-prof-base-4.17.1.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-prof-text-2.0.2 \
ghc-semver-devel"

inherit rpm
