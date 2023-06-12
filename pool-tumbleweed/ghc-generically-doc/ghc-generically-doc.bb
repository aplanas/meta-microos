SUMMARY = "Haskell generically library documentation"
DESCRIPTION = "This package provides the Haskell generically library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-generically-doc-0.1.1-1.2.noarch.rpm"
RPM_HASH = "ea597588bca7666bc9c9c0d861755f8f99376347bded55a44371d5643b583f0e6bf1d421f1d5dc09c5dbc9afa6ec62b83bb0b80b07dbd1610f92eb7fcefec7aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-generically-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
