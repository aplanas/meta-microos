SUMMARY = "Haskell shakespeare library documentation"
DESCRIPTION = "This package provides the Haskell shakespeare library documentation."
LICENSE = "MIT"

PV = "2.0.30"

RPM_NAME = "ghc-shakespeare-doc-2.0.30-2.3.noarch.rpm"
RPM_HASH = "ea7834318011c86d3c59b07a5efbca4b63fd4e2477c7a30e3348d69cc112f6cf1aa99323f741d2eb256879540deabeda980fff29faf2b03f36aa5e728e679293"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-shakespeare-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
