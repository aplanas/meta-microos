SUMMARY = "Haskell persistent library documentation"
DESCRIPTION = "This package provides the Haskell persistent library documentation."
LICENSE = "MIT"

PV = "2.14.5.1"

RPM_NAME = "ghc-persistent-doc-2.14.5.1-1.3.noarch.rpm"
RPM_HASH = "36b1685579b7369ba6e761d82fa5915d319855b67e86fe89e07c6894e32c94a46a5defa0ed0344672444da943c100270219e09bb307275a9f484eb7129bb6af0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-persistent-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
