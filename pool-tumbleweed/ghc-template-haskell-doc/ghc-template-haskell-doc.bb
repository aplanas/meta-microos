SUMMARY = "Haskell template-haskell library documentation"
DESCRIPTION = "This package provides the Haskell template-haskell library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.19.0.0"

RPM_NAME = "ghc-template-haskell-doc-2.19.0.0-3.1.noarch.rpm"
RPM_HASH = "8c275ae83331923d909dc73acf56772248f2be1afe886abaf0663b86a213fbf6dc4a244a93c5106978f2745bab1b12a205d9623e341649d4e9db0ca1d9d1af6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-template-haskell-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
