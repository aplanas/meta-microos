SUMMARY = "Haskell typst library documentation"
DESCRIPTION = "This package provides the Haskell typst library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-typst-doc-0.1.0.0-1.11.noarch.rpm"
RPM_HASH = "3c8f4c0b75c074b2983dcf6fea26230cf1dc2a60d68d8a77823d0f6ebb07bec1a7f61376028ab880d8b7a62d962e7ad1da0527b901024a67ce160135a340abdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-typst-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
