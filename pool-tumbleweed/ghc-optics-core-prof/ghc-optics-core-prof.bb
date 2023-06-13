SUMMARY = "Haskell optics-core profiling library"
DESCRIPTION = "This package provides the Haskell optics-core profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "ghc-optics-core-prof-0.4.1-2.3.aarch64.rpm"
RPM_HASH = "04f7f69f61bf4c9735ad1e904c986e6967eafac07bc47a1cde4eee9587181899dee30a848148f099088cbd54916dec8a8470ed08293a7b5a99166500ba25e3a6"

RPROVIDES:${PN} += "ghc-optics-core-prof \
ghc-optics-core-prof(aarch-64) \
ghc-prof(optics-core-0.4.1-Awni0JkjGzeFZo6HXDNwcT)"

RDEPENDS:${PN} += "ghc-optics-core-devel \
ghc-prof(array-0.5.4.0) \
ghc-prof(base-4.17.1.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(indexed-profunctors-0.1.1-8slbuH4IUUg1HsCF6rf8GV) \
ghc-prof(indexed-traversable-0.1.2.1-1XiSi5jKFt6BqKufaNXxBs) \
ghc-prof(transformers-0.5.6.2)"

inherit rpm
