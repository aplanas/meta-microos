SUMMARY = "Haskell HsYAML library development files"
DESCRIPTION = "This package provides the Haskell HsYAML library development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.1.1"

RPM_NAME = "ghc-HsYAML-devel-0.2.1.1-3.3.aarch64.rpm"
RPM_HASH = "fd51a9c29626c2b70418a43478ebd2f44f8471530a3d299209107bee38af7fa8a62c28ba80a5b86e4857d96fa6c9f505e7cd919c8664f74671a0960b7d4b3443"

RPROVIDES:${PN} += "ghc-HsYAML-devel \
ghc-devel-HsYAML-0.2.1.1-KzoQvRN4UKW2jR1yND83sf"

RDEPENDS:${PN} += "/bin/sh \
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
