SUMMARY = "Haskell array library documentation"
DESCRIPTION = "This package provides the Haskell array library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.4.0"

RPM_NAME = "ghc-array-doc-0.5.4.0-1.1.noarch.rpm"
RPM_HASH = "b3027d123367499d022cd5d6d111c9811bc9dfe1efb83df7022b3ff0ed9dbc0b9377f256141103e347009d15be69e499534c78b83d69de2a56b822fd0fa33778"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-array-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
