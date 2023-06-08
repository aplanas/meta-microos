SUMMARY = "Haskell lpeg library documentation"
DESCRIPTION = "This package provides the Haskell lpeg library documentation."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "ghc-lpeg-doc-1.0.4-1.3.noarch.rpm"
RPM_HASH = "2d2c7396aa41a766f79d97c1cdc5115ef337f4a44d4ec52bec09213ecba2126970c0f97cb298468e6d9ed41f4c1bb4f42a76e26df9e9779c1ddb2a7c7c140fdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-lpeg-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
