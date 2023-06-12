SUMMARY = "Haskell unicode-data library documentation"
DESCRIPTION = "This package provides the Haskell unicode-data library documentation."
LICENSE = "Apache-2.0"

PV = "0.4.0.1"

RPM_NAME = "ghc-unicode-data-doc-0.4.0.1-3.3.noarch.rpm"
RPM_HASH = "79e3c8ff6cf5b6e1525ad3c0f120792f7d57ec45c8cb4bc139b4fc5b327fef517b49f751f70486fa2e798bbd75d790d8405321171ef2cef73826758bc4e84716"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-unicode-data-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
