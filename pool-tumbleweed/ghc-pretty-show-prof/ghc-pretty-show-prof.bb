SUMMARY = "Haskell pretty-show profiling library"
DESCRIPTION = "This package provides the Haskell pretty-show profiling library."
LICENSE = "MIT"

PV = "1.10"

RPM_NAME = "ghc-pretty-show-prof-1.10-4.6.aarch64.rpm"
RPM_HASH = "6e6460ceeb4277c03479838586fe1c28b09c196792a1d09df30addc6b109cd6721f45bcd4a185b84ef2aa27518bf243ea468f4184284e3681d671f3a91103ee8"

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
