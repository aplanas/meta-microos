SUMMARY = "Haskell pandoc-server library documentation"
DESCRIPTION = "This package provides the Haskell pandoc-server library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.0.1"

RPM_NAME = "ghc-pandoc-server-doc-0.1.0.1-1.4.noarch.rpm"
RPM_HASH = "cacd759112846df895c42cdc2155d539c5b71b98a37ed82a5ec0115d481efe1ab9cd8d364b2c4990dadad608dcbe9c521b5e6d710dd490fbe7b9936fd8454e81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pandoc-server-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
