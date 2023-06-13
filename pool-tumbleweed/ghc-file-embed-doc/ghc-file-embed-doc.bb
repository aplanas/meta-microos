SUMMARY = "Haskell file-embed library documentation"
DESCRIPTION = "This package provides the Haskell file-embed library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.0.15.0"

RPM_NAME = "ghc-file-embed-doc-0.0.15.0-2.2.noarch.rpm"
RPM_HASH = "2af5c1565df910d1459947ea79105d87689f9cca1ddd282a251ca57468eb0b641d5d4042d940417f0c7f04a54f1dfcec51047d2981aa89b15e7004978353a4bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-file-embed-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
