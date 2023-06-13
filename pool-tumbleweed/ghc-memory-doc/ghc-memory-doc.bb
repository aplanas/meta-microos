SUMMARY = "Haskell memory library documentation"
DESCRIPTION = "This package provides the Haskell memory library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.18.0"

RPM_NAME = "ghc-memory-doc-0.18.0-2.3.noarch.rpm"
RPM_HASH = "7b3a5b96212e6cd5c464d63af685cffd9d4d95e822efeacbce4a727ad99ea9563c58ccd63bacfdba586968189d540541213391cfc405536d5b62ba79275a4b83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-memory-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
