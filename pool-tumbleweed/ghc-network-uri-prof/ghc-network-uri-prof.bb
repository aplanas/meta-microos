SUMMARY = "Haskell network-uri profiling library"
DESCRIPTION = "This package provides the Haskell network-uri profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.6.4.2"

RPM_NAME = "ghc-network-uri-prof-2.6.4.2-2.6.aarch64.rpm"
RPM_HASH = "f2b9dde9d630ad4ff6716e9a061a32910e2646935e6d26d594cecd4f0cf892c6b235b2ae11c97f16ee3d80a4db843b28b194ef6df634e88ab429895b135264ac"

RPROVIDES:${PN} += "ghc-network-uri-prof \
ghc-prof-network-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH"

RDEPENDS:${PN} += "ghc-network-uri-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-th-compat-0.1.4-Bzk38miPOyTJh1KMkOoOkv"

inherit rpm
