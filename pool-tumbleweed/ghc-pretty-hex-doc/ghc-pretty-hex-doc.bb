SUMMARY = "Haskell pretty-hex library documentation"
DESCRIPTION = "This package provides the Haskell pretty-hex library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "ghc-pretty-hex-doc-1.1-4.2.noarch.rpm"
RPM_HASH = "6dce8bbe1296173f8f5e205f6afe2a8aded675a649ec5a5a6f16d0d6c05fa529ae363bd05528b85806948001a4b0ef3cf30e64b85c296b89350d8948bb89cc72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pretty-hex-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
