SUMMARY = "Haskell ed25519 library documentation"
DESCRIPTION = "This package provides the Haskell ed25519 library documentation."
LICENSE = "MIT"

PV = "0.0.5.0"

RPM_NAME = "ghc-ed25519-doc-0.0.5.0-16.4.noarch.rpm"
RPM_HASH = "6761cac4a8e117aa02d44096b8c97a4d319804812527cebfeeccd673b5712e0eefbcf100ab52acdf9c043d629ade96a13739b3cc5aa7f00a483aafa7355148b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ed25519-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
