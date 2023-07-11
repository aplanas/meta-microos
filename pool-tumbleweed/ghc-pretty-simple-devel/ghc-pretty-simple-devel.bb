SUMMARY = "Haskell pretty-simple library development files"
DESCRIPTION = "This package provides the Haskell pretty-simple library development files."
LICENSE = "BSD-3-Clause"

PV = "4.1.2.0"

RPM_NAME = "ghc-pretty-simple-devel-4.1.2.0-1.6.aarch64.rpm"
RPM_HASH = "e0277781e8688b345f660ceabab28e29c442b5dd5799088a5e52e5a3308b155ae99b23abcc9d0839d533dde534e1d8c28d697575d2cf5015d84eef2f0a763359"

RPROVIDES:${PN} += "ghc-devel-pretty-simple-4.1.2.0-AmUJ4bdBPRILOonshKqIvK \
ghc-pretty-simple-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-mtl-2.2.2 \
ghc-devel-prettyprinter-1.7.1-1jjh6iCiPNl8MgeqtPsio2 \
ghc-devel-prettyprinter-ansi-terminal-1.1.3-QQli2Jew8AdEXEsQuhGa \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-pretty-simple"

inherit rpm
