SUMMARY = "Haskell blaze-markup library documentation"
DESCRIPTION = "This package provides the Haskell blaze-markup library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.8.2.8"

RPM_NAME = "ghc-blaze-markup-doc-0.8.2.8-6.3.noarch.rpm"
RPM_HASH = "0c7c99d05de83705a782db0ca6132f2a86a8b9ae19cf4e435289dcd669dd12e0fa88c7e33b1b8341f54b1004c21aa73a89e33a5cc4375874b089deb84c47ab78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-blaze-markup-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
