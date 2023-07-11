SUMMARY = "Haskell language-javascript library development files"
DESCRIPTION = "This package provides the Haskell language-javascript library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.7.1.0"

RPM_NAME = "ghc-language-javascript-devel-0.7.1.0-4.6.aarch64.rpm"
RPM_HASH = "cc45196d0999135c4df7bf876e409497b1a528b107d39b8ebbec76b9e8208ca60e457a33420851715c6bc7abf7232285dcf166303c31752884cb0e6f1ffcd35f"

RPROVIDES:${PN} += "ghc-devel-language-javascript-0.7.1.0-3FqnIQtG3956Mxug7EpqjM \
ghc-language-javascript-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-blaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-mtl-2.2.2 \
ghc-devel-text-2.0.2 \
ghc-devel-utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q \
ghc-language-javascript"

inherit rpm
