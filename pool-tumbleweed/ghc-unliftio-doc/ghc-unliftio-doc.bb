SUMMARY = "Haskell unliftio library documentation"
DESCRIPTION = "This package provides the Haskell unliftio library documentation."
LICENSE = "MIT"

PV = "0.2.25.0"

RPM_NAME = "ghc-unliftio-doc-0.2.25.0-1.4.noarch.rpm"
RPM_HASH = "d32043319e9595937dca0df1b25fbb6cb32e90aa3564860f845d7dd45ed26c0b5cf2067482fd24a824aa24d3d871f26456e5035adce65680d7507164c2bda704"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-unliftio-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
