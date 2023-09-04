SUMMARY = "Haskell shakespeare library documentation"
DESCRIPTION = "This package provides the Haskell shakespeare library documentation."
LICENSE = "MIT"

PV = "2.0.30"

RPM_NAME = "ghc-shakespeare-doc-2.0.30-2.10.noarch.rpm"
RPM_HASH = "9321fe3fc49136f6858e1c735fef81c04f3be4d5bd33deb67e54243b0326a9234fcf42b0c1578f68eac0feb741f9a4a3f480607e65795d88a54410922b8aca75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-shakespeare-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
