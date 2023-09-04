SUMMARY = "Haskell recv library documentation"
DESCRIPTION = "This package provides the Haskell recv library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "ghc-recv-doc-0.1.0-1.8.noarch.rpm"
RPM_HASH = "e4ded1dff95a4ef1702a9f34bc581c8ca508ef3d3007b1c33401f15c8f7311f00850123e80b7d8d5b96a65f5c213efe0ba5e48c762b2e83db43e03247251845b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-recv-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
