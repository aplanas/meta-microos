SUMMARY = "Haskell text-short library development files"
DESCRIPTION = "This package provides the Haskell text-short library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.5"

RPM_NAME = "ghc-text-short-devel-0.1.5-3.6.aarch64.rpm"
RPM_HASH = "43096a9e844230cfaf2fc4b34c7c0961361cf46cfe4665e14a56e4d25ce18af3569fd6532d82a2d053227cd158f8b6f8a755aadd6447036cb31a773203edcec1"

RPROVIDES:${PN} += "ghc-devel-text-short-0.1.5-82jy4M6AvoMDwlCMY2Ykx2 \
ghc-text-short-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-ghc-prim-0.9.0 \
ghc-devel-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-text-2.0.2 \
ghc-text-short"

inherit rpm
