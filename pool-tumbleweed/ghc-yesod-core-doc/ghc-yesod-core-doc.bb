SUMMARY = "Haskell yesod-core library documentation"
DESCRIPTION = "This package provides the Haskell yesod-core library documentation."
LICENSE = "MIT"

PV = "1.6.24.2"

RPM_NAME = "ghc-yesod-core-doc-1.6.24.2-1.7.noarch.rpm"
RPM_HASH = "e8616a9f17b00dfae0958345ba803e95725983c889b6164ccc1e35320d420087ca731b75b78e13f0239d0662b8f1eddd91cfdad8a6874b4a4d5fb8001aee2ef1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-yesod-core-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
