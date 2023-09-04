SUMMARY = "Haskell haskell-lexer library documentation"
DESCRIPTION = "This package provides the Haskell haskell-lexer library documentation."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "ghc-haskell-lexer-doc-1.1.1-2.8.noarch.rpm"
RPM_HASH = "5b844636eebe4c5c1d061646dcd623e1d8e9e406df25ac38b2dd966c1c639647b898c244cbb154d5d7ba68366400437643d4feb7eb9f41005b1cfa00c0c89508"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-haskell-lexer-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
