SUMMARY = "Haskell terminal-size library documentation"
DESCRIPTION = "This package provides the Haskell terminal-size library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-terminal-size-doc-0.3.4-1.2.noarch.rpm"
RPM_HASH = "fa36c7135ff3f2a32ef5d782a534b28e387e49fa31efe211ffd0aa4278f7adf7e175dcfc0814647973d569c083233a91348f2d984b44ccdf3dddf99b9d22b3a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-terminal-size-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
