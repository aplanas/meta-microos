SUMMARY = "Haskell language-javascript profiling library"
DESCRIPTION = "This package provides the Haskell language-javascript profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.7.1.0"

RPM_NAME = "ghc-language-javascript-prof-0.7.1.0-4.3.aarch64.rpm"
RPM_HASH = "e486a3ef4a046bfbd079a5e8b322d4f7af04bab5b7b31557c2fcd3dcb76dcd3aa78b762a3dd0e19534930823d4befbd216b8cff21aac036cf09a3f6716b8ad15"

RPROVIDES:${PN} += "ghc-language-javascript-prof \
ghc-prof-language-javascript-0.7.1.0-3FqnIQtG3956Mxug7EpqjM"

RDEPENDS:${PN} += "ghc-language-javascript-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-blaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-mtl-2.2.2 \
ghc-prof-text-2.0.2 \
ghc-prof-utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q"

inherit rpm
