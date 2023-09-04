SUMMARY = "Haskell network library documentation"
DESCRIPTION = "This package provides the Haskell network library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.1.4.0"

RPM_NAME = "ghc-network-doc-3.1.4.0-2.3.noarch.rpm"
RPM_HASH = "b6a016f0ebdbfb9abd16305d546246d0dc21263b87f4befed84f1c4897b1e9505ee9ee09f715f238765a5518839e89f41a93805c8953926bb5ad323b2be1c152"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-network-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
