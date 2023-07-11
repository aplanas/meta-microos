SUMMARY = "Haskell pandoc-types library development files"
DESCRIPTION = "This package provides the Haskell pandoc-types library development files."
LICENSE = "GPL-2.0-only"

PV = "1.23"

RPM_NAME = "ghc-pandoc-types-devel-1.23-1.6.aarch64.rpm"
RPM_HASH = "7c016c7d0d1915258075b02892ca94f6bd02797878a9fd5d51386deeea7db81034026fb5b538ab7167b519c875e97ee3ae3c1a3e1feaa2ec8571ef72d7271f47"

RPROVIDES:${PN} += "ghc-devel-pandoc-types-1.23-4C1nzwOnt973xRAA9sp531 \
ghc-pandoc-types-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-QuickCheck-2.14.3-6dq2izV8oSq1BobaDA598X \
ghc-devel-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-ghc-prim-0.9.0 \
ghc-devel-syb-0.7.2.3-J0Qw7O8gTR0DSXObDhEt8i \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-pandoc-types"

inherit rpm
