SUMMARY = "Haskell skylighting-format-ansi library documentation"
DESCRIPTION = "This package provides the Haskell skylighting-format-ansi library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-ansi-doc-0.1-2.11.noarch.rpm"
RPM_HASH = "b5a9e1e4755a307c242e8d720040f4e8e45354cfa8e24eb99b6f29e43f3cc4c992b86f541481791302d4aa6e188ba8c204cf9cb76e8bc46055ff89802b72b0a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skylighting-format-ansi-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
