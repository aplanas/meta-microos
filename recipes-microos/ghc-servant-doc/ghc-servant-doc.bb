SUMMARY = "Haskell servant library documentation"
DESCRIPTION = "This package provides the Haskell servant library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.19.1"

RPM_NAME = "ghc-servant-doc-0.19.1-2.3.noarch.rpm"
RPM_HASH = "15dd0d638ebde9fe8268434cd87986b19107afb629fa62402ce81ecf1b74b4d873ba02a7707571e6bdf29dcd5316a412da646d7b086e07cbf3f23bd4e9a4eebf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-servant-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
