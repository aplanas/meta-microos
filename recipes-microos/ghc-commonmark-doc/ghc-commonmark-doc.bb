SUMMARY = "Haskell commonmark library documentation"
DESCRIPTION = "This package provides the Haskell commonmark library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "ghc-commonmark-doc-0.2.2-2.3.noarch.rpm"
RPM_HASH = "4f60350fe1ed11c2bfc6e15754cb8a28ddeabf687dbc477af42d2040971e438760773fd78012591406e1495f38bc79a07367feb2d6ac249a0c486516e73d454c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-commonmark-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
