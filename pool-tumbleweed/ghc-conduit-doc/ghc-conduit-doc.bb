SUMMARY = "Haskell conduit library documentation"
DESCRIPTION = "This package provides the Haskell conduit library documentation."
LICENSE = "MIT"

PV = "1.3.5"

RPM_NAME = "ghc-conduit-doc-1.3.5-1.7.noarch.rpm"
RPM_HASH = "49524da70a321bf3dbb785d52dee3a47a78062c2e3fc6054930219807cc41b0ef0f63ca070b4a1b92c2d8addb24532ceed3067cd10300098353e641cf2769240"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-conduit-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
