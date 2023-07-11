SUMMARY = "Haskell skylighting-format-context library documentation"
DESCRIPTION = "This package provides the Haskell skylighting-format-context library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.2"

RPM_NAME = "ghc-skylighting-format-context-doc-0.1.0.2-1.4.noarch.rpm"
RPM_HASH = "8e571aa809dfb68de6d56999431dacfba4049533bfd035c12f7fac41c4c5d9df4d0be914bc2d4a7a30d5b9dec4af4f36868ac4f58ba7f403154fcb1b8d7cba24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skylighting-format-context-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
