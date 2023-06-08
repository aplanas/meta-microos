SUMMARY = "Haskell ansi-terminal library documentation"
DESCRIPTION = "This package provides the Haskell ansi-terminal library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.11.5"

RPM_NAME = "ghc-ansi-terminal-doc-0.11.5-1.2.noarch.rpm"
RPM_HASH = "38c49daa674556f737d45dec99312881288580113ce7f158af6e87e6ac8a9ca1637a22ed1953eb9d3ac947ef2fc6a7ed71fa1101f4984bdac0a6b5b55accd7da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ansi-terminal-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
