SUMMARY = "Haskell HsYAML profiling library"
DESCRIPTION = "This package provides the Haskell HsYAML profiling library."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.1.1"

RPM_NAME = "ghc-HsYAML-prof-0.2.1.1-3.3.aarch64.rpm"
RPM_HASH = "30cd72e8d185c2092506700e8951a43177bfe92d42a0659a0d619aa06e09b904a637cdabf2673b87f6d470fde3939b70069b4660924c15c647eec987dfa10b22"

RPROVIDES:${PN} += "ghc-HsYAML-prof \
ghc-prof-HsYAML-0.2.1.1-KzoQvRN4UKW2jR1yND83sf"

RDEPENDS:${PN} += "ghc-HsYAML-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-mtl-2.2.2 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2"

inherit rpm
