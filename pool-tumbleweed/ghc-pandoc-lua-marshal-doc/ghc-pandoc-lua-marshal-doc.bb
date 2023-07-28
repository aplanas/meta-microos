SUMMARY = "Haskell pandoc-lua-marshal library documentation"
DESCRIPTION = "This package provides the Haskell pandoc-lua-marshal library documentation."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "ghc-pandoc-lua-marshal-doc-0.2.2-1.8.noarch.rpm"
RPM_HASH = "9c369203a7e4c2feb3ff759ee378e64ea6e493c736f670fad727f951df5f601fffe1158c7869fdd34ab69254788701180a6dd7ba15dbc2116b2b9f048580a749"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pandoc-lua-marshal-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
