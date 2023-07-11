SUMMARY = "Haskell transformers-compat library documentation"
DESCRIPTION = "This package provides the Haskell transformers-compat library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.7.2"

RPM_NAME = "ghc-transformers-compat-doc-0.7.2-2.6.noarch.rpm"
RPM_HASH = "042c9589fa4c23a60c7e8105767aa4640521feb2fddeb1986ff17d902664be3c2e32da9db56f944b76abbf900d9d5e9369e69fbe1bf3aff275cdddf912ec7799"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-transformers-compat-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
