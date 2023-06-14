SUMMARY = "Haskell pandoc-types profiling library"
DESCRIPTION = "This package provides the Haskell pandoc-types profiling library."
LICENSE = "GPL-2.0-only"

PV = "1.23"

RPM_NAME = "ghc-pandoc-types-prof-1.23-1.3.aarch64.rpm"
RPM_HASH = "ddb5244c713fe1dce8899258c87364ab8de09e3aefd47f5a260ff3214a3acc08c5fcb7c63652a91bdb8fb2390955125fca35c2aa5e5bf0b8ee9b5389a6688f94"

RPROVIDES:${PN} += "ghc-pandoc-types-prof \
ghc-prof-pandoc-types-1.23-EFziwPO22I72D2SxHphq63"

RDEPENDS:${PN} += "ghc-pandoc-types-devel \
ghc-prof-QuickCheck-2.14.2-Ifslnzw9cpLJMSBGXVUlx6 \
ghc-prof-aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-ghc-prim-0.9.0 \
ghc-prof-syb-0.7.2.3-J0Qw7O8gTR0DSXObDhEt8i \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2"

inherit rpm
