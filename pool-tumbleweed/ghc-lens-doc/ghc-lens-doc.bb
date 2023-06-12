SUMMARY = "Haskell lens library documentation"
DESCRIPTION = "This package provides the Haskell lens library documentation."
LICENSE = "BSD-2-Clause"

PV = "5.2.2"

RPM_NAME = "ghc-lens-doc-5.2.2-1.3.noarch.rpm"
RPM_HASH = "a0f8f8dccc1544355b6cae7f4699448229f1e3c5ba0eef44e757e717803c96e151e51f807ebe36bb82d87ccfe2f3bd141fc798de062d3852be97618653831c13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-lens-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
