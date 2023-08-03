SUMMARY = "Haskell skylighting-format-context library documentation"
DESCRIPTION = "This package provides the Haskell skylighting-format-context library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.2"

RPM_NAME = "ghc-skylighting-format-context-doc-0.1.0.2-1.6.noarch.rpm"
RPM_HASH = "3a51537b529957e022256b6d146b9305bff428ebf510a0c23e4265f683e5edf58729945e502de34da7b3ef4f90c4fd7a37d7cc5764449126bf7a26b4c5177301"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skylighting-format-context-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
