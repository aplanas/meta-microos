SUMMARY = "Haskell cassava-megaparsec library documentation"
DESCRIPTION = "This package provides the Haskell cassava-megaparsec library documentation."
LICENSE = "MIT"

PV = "2.0.4"

RPM_NAME = "ghc-cassava-megaparsec-doc-2.0.4-3.5.noarch.rpm"
RPM_HASH = "9b444d75fbabc8a95226c70299879401210aa36fe063ca505094f9e4f8a6baeacb86ec4e9ace92298d53994bcf7020da9a3e5776767257dd33680be2fa7b8193"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cassava-megaparsec-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
