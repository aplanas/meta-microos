SUMMARY = "Haskell cookie library documentation"
DESCRIPTION = "This package provides the Haskell cookie library documentation."
LICENSE = "MIT"

PV = "0.4.6"

RPM_NAME = "ghc-cookie-doc-0.4.6-2.2.noarch.rpm"
RPM_HASH = "616562a78ffdda36d7cbfeb1b291b68b79ad53380112bf688fd2a34b593977f4de762e3c8fde86676393f2eea7bab268c5fd2dc672b8bf066bf5191812d5c472"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cookie-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
