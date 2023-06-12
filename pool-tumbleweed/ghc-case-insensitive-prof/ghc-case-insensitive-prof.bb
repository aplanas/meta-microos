SUMMARY = "Haskell case-insensitive profiling library"
DESCRIPTION = "This package provides the Haskell case-insensitive profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.2.1.0"

RPM_NAME = "ghc-case-insensitive-prof-1.2.1.0-6.2.aarch64.rpm"
RPM_HASH = "6562aec989e300c674a8f5ef47daf9ab17c5e994bb7f5ce288c1eea0193bac513e2573dbc01df631687f89ba7986b63664605b8f381bc0c2d7248db8dc45875d"

RPROVIDES:${PN} += "ghc-case-insensitive-prof \
ghc-case-insensitive-prof(aarch-64) \
ghc-prof(case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3)"
RDEPENDS:${PN} += "ghc-case-insensitive-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(deepseq-1.4.8.0) \
ghc-prof(hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt) \
ghc-prof(text-2.0.2)"

inherit rpm
