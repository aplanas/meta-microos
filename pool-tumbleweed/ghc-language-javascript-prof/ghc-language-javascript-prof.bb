SUMMARY = "Haskell language-javascript profiling library"
DESCRIPTION = "This package provides the Haskell language-javascript profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.7.1.0"

RPM_NAME = "ghc-language-javascript-prof-0.7.1.0-4.6.aarch64.rpm"
RPM_HASH = "c546bcfe8a1865853536cde80d6f54fda09e8079961d1dda04ccd8dc11bb8460cfd0d8a44d778928deab154899e2bbc4bbec3857877eb153e9279b7d5f0f3317"

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
