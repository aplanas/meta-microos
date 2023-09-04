SUMMARY = "Haskell microlens-mtl library documentation"
DESCRIPTION = "This package provides the Haskell microlens-mtl library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.0.3"

RPM_NAME = "ghc-microlens-mtl-doc-0.2.0.3-2.3.noarch.rpm"
RPM_HASH = "1d9fa0fbafed55f8b3d6567b9a826f832316cfe089894ec0a82919618c23f361a5f50d165792f8d64480f058cb1bb8a16bb63dddd3c393fe92f6ed9fa9faba00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-microlens-mtl-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
