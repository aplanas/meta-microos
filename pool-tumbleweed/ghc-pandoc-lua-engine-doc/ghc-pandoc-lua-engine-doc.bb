SUMMARY = "Haskell pandoc-lua-engine library documentation"
DESCRIPTION = "This package provides the Haskell pandoc-lua-engine library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0.1"

RPM_NAME = "ghc-pandoc-lua-engine-doc-0.2.0.1-1.5.noarch.rpm"
RPM_HASH = "3faf7a7125feea5f2377b5cc3ad5ffbec5946aba2a670db89dd9942a3eb6da9f419ee99b44e014ea139a9315b749cfb3e74ff11977c02635c722e00515ade327"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pandoc-lua-engine-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
