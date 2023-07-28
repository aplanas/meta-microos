SUMMARY = "Haskell HsYAML library development files"
DESCRIPTION = "This package provides the Haskell HsYAML library development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.1.1"

RPM_NAME = "ghc-HsYAML-devel-0.2.1.1-4.1.aarch64.rpm"
RPM_HASH = "1c12ad51a0b6b687b01c4f2f4c77b0c7261d5993980687f5936b7ac38776985ea1b14df33bbe1e5bab17aca2bd19c17a5eac634149a29ba1145d649342c74de1"

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
