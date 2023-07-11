SUMMARY = "Haskell pandoc-types profiling library"
DESCRIPTION = "This package provides the Haskell pandoc-types profiling library."
LICENSE = "GPL-2.0-only"

PV = "1.23"

RPM_NAME = "ghc-pandoc-types-prof-1.23-1.6.aarch64.rpm"
RPM_HASH = "f1487486421c870a14fd5cf71812dbb34adfeca8738fcbc42f04c884162db81fa0c0d723cdbd61b851ff5ae632ece95eb786fccb94b98fd94ce71c5fe44a990b"

RPROVIDES:${PN} += "ghc-pandoc-types-prof \
ghc-prof-pandoc-types-1.23-4C1nzwOnt973xRAA9sp531"

RDEPENDS:${PN} += "ghc-pandoc-types-devel \
ghc-prof-QuickCheck-2.14.3-6dq2izV8oSq1BobaDA598X \
ghc-prof-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-ghc-prim-0.9.0 \
ghc-prof-syb-0.7.2.3-J0Qw7O8gTR0DSXObDhEt8i \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2"

inherit rpm
