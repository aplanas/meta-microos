SUMMARY = "Haskell semver library development files"
DESCRIPTION = "This package provides the Haskell semver library development files."
LICENSE = "MPL-2.0"

PV = "0.4.0.1"

RPM_NAME = "ghc-semver-devel-0.4.0.1-1.6.aarch64.rpm"
RPM_HASH = "b6ba01a781e47dd8241ebe6c47da4dc06621fafda4419536dd33f3a768ee44ef6efaaecc61c80fbd83aa14e52b2c33d365c3e9b245ba91037be2ee0ab84ec3b3"

RPROVIDES:${PN} += "ghc-devel-semver-0.4.0.1-ExZNCX3NISc5JbXfrvXt6N \
ghc-semver-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-devel-base-4.17.1.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-devel-text-2.0.2 \
ghc-semver"

inherit rpm
