SUMMARY = "Haskell crypto-api library documentation"
DESCRIPTION = "This package provides the Haskell crypto-api library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.13.3"

RPM_NAME = "ghc-crypto-api-doc-0.13.3-5.3.noarch.rpm"
RPM_HASH = "49b3db71e44aea2fc0d86a5c507c63bec18c6ec9270c69c80615de1639dc2676e333cff26efbca698c77546aebfa0c043101e3a41c7ba348c4013aa2090e6757"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-crypto-api-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
