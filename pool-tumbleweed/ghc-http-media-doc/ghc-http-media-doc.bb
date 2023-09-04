SUMMARY = "Haskell http-media library documentation"
DESCRIPTION = "This package provides the Haskell http-media library documentation."
LICENSE = "MIT"

PV = "0.8.0.0"

RPM_NAME = "ghc-http-media-doc-0.8.0.0-6.9.noarch.rpm"
RPM_HASH = "3ca67efb3927fad01377ba55f157d0cdfd93c4e3be431b17ed13b68b71e10d6d0ae32b8d140bb0828e1228da0a9ef39f99f68e68cdb4d4e3c84e70d925fa03d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-http-media-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
