SUMMARY = "Haskell HsYAML library development files"
DESCRIPTION = "This package provides the Haskell HsYAML library development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.1.1"

RPM_NAME = "ghc-HsYAML-devel-0.2.1.1-3.6.aarch64.rpm"
RPM_HASH = "cfd99b539bb05ddf3ce3922bdbcd57b3c184872c89f540566ec88ab4c5e67c524999611d25f19a8608b06eb8e128e5d9d4622c2a654a123389c03cdea79724ef"

RPROVIDES:${PN} += "ghc-HsYAML-devel \
ghc-devel-HsYAML-0.2.1.1-KzoQvRN4UKW2jR1yND83sf"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-HsYAML \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-mtl-2.2.2 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2"

inherit rpm
