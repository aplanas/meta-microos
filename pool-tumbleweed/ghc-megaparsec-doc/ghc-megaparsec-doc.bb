SUMMARY = "Haskell megaparsec library documentation"
DESCRIPTION = "This package provides the Haskell megaparsec library documentation."
LICENSE = "BSD-2-Clause"

PV = "9.3.1"

RPM_NAME = "ghc-megaparsec-doc-9.3.1-1.3.noarch.rpm"
RPM_HASH = "620341a51a9b7b259ac698c0103a488e921be3ff266470ecd8b74058ea58a3d891b71b93ac9f85f0ddfca10ae567df2ad0c0d2477029ed8245ef41081fd1a562"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-megaparsec-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
