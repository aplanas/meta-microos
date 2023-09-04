SUMMARY = "Haskell X11-xft library documentation"
DESCRIPTION = "This package provides the Haskell X11-xft library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-X11-xft-doc-0.3.4-2.3.noarch.rpm"
RPM_HASH = "c19baaf44475b69861a45794380e201d26d067b6cc728dd3172aab02482ad225dcc2b2f079b74766a7303038c8d129d571bfd6062a7174058b7967e5311e14ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-X11-xft-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
