SUMMARY = "Haskell crypto-random library documentation"
DESCRIPTION = "This package provides the Haskell crypto-random library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.0.9"

RPM_NAME = "ghc-crypto-random-doc-0.0.9-6.1.noarch.rpm"
RPM_HASH = "037ceedadf13e30610dfdc31077086453e307974f4474f8eb09000f7e3f2560f3ad848ec74f92fac6ffca5347f84db83df65217b6ae322a535e92f7b430b88d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-crypto-random-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
