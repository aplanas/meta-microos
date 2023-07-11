SUMMARY = "Haskell megaparsec profiling library"
DESCRIPTION = "This package provides the Haskell megaparsec profiling library."
LICENSE = "BSD-2-Clause"

PV = "9.3.1"

RPM_NAME = "ghc-megaparsec-prof-9.3.1-1.3.aarch64.rpm"
RPM_HASH = "82df0ff81e9302483474ae1df09182d9e5330c9f92ae121c77c6ea1332023ee65002ba9097e7cea9cbd971d2ff5ea87f546e95001eb9c78bd27ccf7ff62965de"

RPROVIDES:${PN} += "ghc-megaparsec-prof \
ghc-prof-megaparsec-9.3.1-Lptmv1Cc41nKt1ZYt8kXVr"

RDEPENDS:${PN} += "ghc-megaparsec-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-mtl-2.2.2 \
ghc-prof-parser-combinators-1.3.0-69OkkuibEVDB76y6u8xJBt \
ghc-prof-scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1 \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2"

inherit rpm
