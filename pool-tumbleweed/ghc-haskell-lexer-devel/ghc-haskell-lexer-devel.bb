SUMMARY = "Haskell haskell-lexer library development files"
DESCRIPTION = "This package provides the Haskell haskell-lexer library development files."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "ghc-haskell-lexer-devel-1.1.1-2.3.aarch64.rpm"
RPM_HASH = "61c0fe842aece53b00abacf606645cabac3de014ed3c822b23585187f154d12b0529d2a40dd2e82412ae2b430fb6b23e106dcaad63ed3ca9e7fd52b06202abc0"

RPROVIDES:${PN} += "ghc-devel(haskell-lexer-1.1.1-FBBQnuYVuwZ6NRUVHfUjFR) \
ghc-haskell-lexer-devel \
ghc-haskell-lexer-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-haskell-lexer"

inherit rpm
