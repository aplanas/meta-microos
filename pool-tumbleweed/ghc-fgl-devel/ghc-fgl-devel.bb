SUMMARY = "Haskell fgl library development files"
DESCRIPTION = "This package provides the Haskell fgl library development files."
LICENSE = "BSD-3-Clause"

PV = "5.8.0.0"

RPM_NAME = "ghc-fgl-devel-5.8.0.0-3.4.aarch64.rpm"
RPM_HASH = "44dcf9f528d5335f843d010b4db779a485ea8714edf950e97914bef55dd8e0c3a19cb9781a502ccd73b9d62902f47d90e6858caf58250e80baea857b93c7bb7b"

RPROVIDES:${PN} += "ghc-devel-fgl-5.8.0.0-JXOHdIncLQ9K05kSZoGOKU \
ghc-fgl-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-transformers-0.5.6.2 \
ghc-fgl"

inherit rpm
