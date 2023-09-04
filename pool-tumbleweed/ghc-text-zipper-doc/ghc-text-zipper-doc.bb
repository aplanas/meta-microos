SUMMARY = "Haskell text-zipper library documentation"
DESCRIPTION = "This package provides the Haskell text-zipper library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.12"

RPM_NAME = "ghc-text-zipper-doc-0.12-2.3.noarch.rpm"
RPM_HASH = "6a18b780bc0dad811797e2611771b57c78668a23b2208468df19858da002313409a96bcdb013bc57025dd607bd43c6d14efa095b8bc4627b5d63cd82f783a4ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-text-zipper-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
