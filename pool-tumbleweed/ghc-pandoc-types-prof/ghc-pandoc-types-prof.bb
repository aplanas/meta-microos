SUMMARY = "Haskell pandoc-types profiling library"
DESCRIPTION = "This package provides the Haskell pandoc-types profiling library."
LICENSE = "GPL-2.0-only"

PV = "1.23.0.1"

RPM_NAME = "ghc-pandoc-types-prof-1.23.0.1-1.1.aarch64.rpm"
RPM_HASH = "3239e8ae9c5ba79509432673cfac86c9cf9ec5153ba4efe15c7dd35553834ed513fe89473cf809cb287c7d6800ba93eeea77db9371e8b1cbeb0ac2e817722d56"

RPROVIDES:${PN} += "ghc-pandoc-types-prof \
ghc-prof-pandoc-types-1.23.0.1-EcvZluXpPb0J10kJC4UfRg"

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
