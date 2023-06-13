SUMMARY = "Haskell skylighting-format-context library documentation"
DESCRIPTION = "This package provides the Haskell skylighting-format-context library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.2"

RPM_NAME = "ghc-skylighting-format-context-doc-0.1.0.2-1.3.noarch.rpm"
RPM_HASH = "cc27814750fee98ccf4d3fcda508b00d3d2862038e1c7c27df66b238fdaf48a5cb5985456924f209a36a7c523883ac2c2a93ce327bfb838d2799e40c8af08e9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skylighting-format-context-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
