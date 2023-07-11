SUMMARY = "Haskell typst library documentation"
DESCRIPTION = "This package provides the Haskell typst library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-typst-doc-0.1.0.0-1.2.noarch.rpm"
RPM_HASH = "9727be0a39a6d5b97fc7796119573172f05d07426d136ca19d9498fdc05cadf3f8a97aab674ae778a6509022958c7c11a01eb06cf60c4120590d58fd085273b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-typst-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
