SUMMARY = "Haskell bifunctors library documentation"
DESCRIPTION = "This package provides the Haskell bifunctors library documentation."
LICENSE = "BSD-2-Clause"

PV = "5.5.15"

RPM_NAME = "ghc-bifunctors-doc-5.5.15-1.3.noarch.rpm"
RPM_HASH = "d011a8a83c307bad2dcf1dfbc36ba49f79bb3221157e8269b9f4b738febb67808f582bb9e4ba787450c86a8738d9aeaef4b016e6e90ac12d081e8d5559374d16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-bifunctors-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
