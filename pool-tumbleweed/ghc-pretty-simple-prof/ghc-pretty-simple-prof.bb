SUMMARY = "Haskell pretty-simple profiling library"
DESCRIPTION = "This package provides the Haskell pretty-simple profiling library."
LICENSE = "BSD-3-Clause"

PV = "4.1.2.0"

RPM_NAME = "ghc-pretty-simple-prof-4.1.2.0-1.6.aarch64.rpm"
RPM_HASH = "c34d2e6c2189af391b2fd524800be908cc63c9888c0d111a84f03d03ec8d671b4a95555e2c534f79da2281100e18b11caac813648673548cce90a771ea54b404"

RPROVIDES:${PN} += "ghc-pretty-simple-prof \
ghc-prof-pretty-simple-4.1.2.0-AmUJ4bdBPRILOonshKqIvK"

RDEPENDS:${PN} += "ghc-pretty-simple-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-mtl-2.2.2 \
ghc-prof-prettyprinter-1.7.1-1jjh6iCiPNl8MgeqtPsio2 \
ghc-prof-prettyprinter-ansi-terminal-1.1.3-QQli2Jew8AdEXEsQuhGa \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2"

inherit rpm
