SUMMARY = "Haskell pandoc-types library development files"
DESCRIPTION = "This package provides the Haskell pandoc-types library development files."
LICENSE = "GPL-2.0-only"

PV = "1.23.0.1"

RPM_NAME = "ghc-pandoc-types-devel-1.23.0.1-1.1.aarch64.rpm"
RPM_HASH = "5660abd6717307b39ad9bfd2f3e268b6a7a4f329e02e31b3363108813d3ff4a1f38897b7028d173bd301d3457aa567b6223847a45b1f894608ac3a8d51f43ca0"

RPROVIDES:${PN} += "ghc-devel-pandoc-types-1.23.0.1-EcvZluXpPb0J10kJC4UfRg \
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
