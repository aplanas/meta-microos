SUMMARY = "Haskell tasty library documentation"
DESCRIPTION = "This package provides the Haskell tasty library documentation."
LICENSE = "MIT"

PV = "1.4.3"

RPM_NAME = "ghc-tasty-doc-1.4.3-1.7.noarch.rpm"
RPM_HASH = "f5447a16f44a0c855e99c9227c07d030ff23853091d8b69250b15917c073b63722fbf0dd9eec0660e250abb779790c47003667c9b7918f48530bf18a6b0954da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-tasty-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
