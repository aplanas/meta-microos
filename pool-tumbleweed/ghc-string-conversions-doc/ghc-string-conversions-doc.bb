SUMMARY = "Haskell string-conversions library documentation"
DESCRIPTION = "This package provides the Haskell string-conversions library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.1"

RPM_NAME = "ghc-string-conversions-doc-0.4.0.1-3.3.noarch.rpm"
RPM_HASH = "3794793ac3c77b73b7261446eb6ee18fd5263eeb80b91336a254b6094c738d9621035bf6269c38191020e79c65faedb6793e2e9a4bcb3d187fd97b21aa5ac4ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-string-conversions-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
