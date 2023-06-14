SUMMARY = "Haskell pretty-show profiling library"
DESCRIPTION = "This package provides the Haskell pretty-show profiling library."
LICENSE = "MIT"

PV = "1.10"

RPM_NAME = "ghc-pretty-show-prof-1.10-4.3.aarch64.rpm"
RPM_HASH = "9f28cd8eeca3fe3ece60e240ade9547d0158523bf1e05f59537ad1db0d12f3a98cd427659cca24c22fd072fa12a3636b64f53f3354e2d050a4b3d17cc6d4a155"

RPROVIDES:${PN} += "ghc-pretty-show-prof \
ghc-prof-pretty-show-1.10-IA5YnfAP5DqIvEIFfcZVdd"

RDEPENDS:${PN} += "ghc-pretty-show-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-ghc-prim-0.9.0 \
ghc-prof-haskell-lexer-1.1.1-FBBQnuYVuwZ6NRUVHfUjFR \
ghc-prof-pretty-1.1.3.6 \
ghc-prof-text-2.0.2"

inherit rpm
