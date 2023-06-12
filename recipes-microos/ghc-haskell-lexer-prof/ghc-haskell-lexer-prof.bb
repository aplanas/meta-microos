SUMMARY = "Haskell haskell-lexer profiling library"
DESCRIPTION = "This package provides the Haskell haskell-lexer profiling library."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "ghc-haskell-lexer-prof-1.1.1-2.3.aarch64.rpm"
RPM_HASH = "9a3b82a765f08e72039f0c413661c5b1909ab98a62d73785e10830fa9167cf61118609262137275b880232c1e7d418d9fbcabf325fdc571451d094f9d44ba1fe"

RPROVIDES:${PN} += "ghc-haskell-lexer-prof \
ghc-haskell-lexer-prof(aarch-64) \
ghc-prof(haskell-lexer-1.1.1-FBBQnuYVuwZ6NRUVHfUjFR)"
RDEPENDS:${PN} += "ghc-haskell-lexer-devel \
ghc-prof(base-4.17.1.0)"

inherit rpm
