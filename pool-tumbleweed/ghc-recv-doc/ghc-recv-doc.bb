SUMMARY = "Haskell recv library documentation"
DESCRIPTION = "This package provides the Haskell recv library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "ghc-recv-doc-0.1.0-1.3.noarch.rpm"
RPM_HASH = "b83a0ddd3fa283d1be361dc27105b46ccd535c80dcf09000baf8ca0e803a4eb8c05c524aba29e6bd622f5f5f5bb6d74a4fce710a9e133da134ba72dabfc4e0d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-recv-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
