SUMMARY = "Haskell filepath-bytestring library documentation"
DESCRIPTION = "This package provides the Haskell filepath-bytestring library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.4.2.1.12"

RPM_NAME = "ghc-filepath-bytestring-doc-1.4.2.1.12-1.3.noarch.rpm"
RPM_HASH = "4ebb5c2e57c709acf82c03b2b5e2ccb59742daaece404c00220486941df423944b5840b851b5c5bf2157270a8be8accc0b35bc16497486cd2dde3de5d928f2a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-filepath-bytestring-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
