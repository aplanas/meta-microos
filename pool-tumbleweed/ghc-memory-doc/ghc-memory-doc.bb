SUMMARY = "Haskell memory library documentation"
DESCRIPTION = "This package provides the Haskell memory library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.18.0"

RPM_NAME = "ghc-memory-doc-0.18.0-2.9.noarch.rpm"
RPM_HASH = "a430374842d76fbd0e91ae15b65aa4c585f12dcc7185007edef987b39deec5d79c690f8cbd18db9a9a3e66ef4235f7a3b513c4c93525736b999d5e466724680a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-memory-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
