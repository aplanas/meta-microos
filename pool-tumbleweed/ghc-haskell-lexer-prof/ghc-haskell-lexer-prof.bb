SUMMARY = "Haskell haskell-lexer profiling library"
DESCRIPTION = "This package provides the Haskell haskell-lexer profiling library."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "ghc-haskell-lexer-prof-1.1.1-2.6.aarch64.rpm"
RPM_HASH = "f961a9afceb04a984db46a77ea6859381810ad523a41954de98eaf04e40bf9708891c89a146dc6b5c4ee8666427edbf4770a50d27e709acf241b221b9f16d683"

RPROVIDES:${PN} += "ghc-haskell-lexer-prof \
ghc-prof-haskell-lexer-1.1.1-FBBQnuYVuwZ6NRUVHfUjFR"

RDEPENDS:${PN} += "ghc-haskell-lexer-devel \
ghc-prof-base-4.17.1.0"

inherit rpm
