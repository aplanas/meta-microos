SUMMARY = "Haskell mime-types library documentation"
DESCRIPTION = "This package provides the Haskell mime-types library documentation."
LICENSE = "MIT"

PV = "0.1.1.0"

RPM_NAME = "ghc-mime-types-doc-0.1.1.0-2.2.noarch.rpm"
RPM_HASH = "1463f6a8869ebb208ff0935907c66b331ddf4267c8eaae1f7b81060f7437deb59ef62d6239956d1c39437a03327f178310db954f03eb32b6841213687a33090d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-mime-types-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
