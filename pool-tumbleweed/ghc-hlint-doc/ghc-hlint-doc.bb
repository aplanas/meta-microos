SUMMARY = "Haskell hlint library documentation"
DESCRIPTION = "This package provides the Haskell hlint library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "ghc-hlint-doc-3.5-1.7.noarch.rpm"
RPM_HASH = "5686ff09fe452d1232ae2037345354ac8d182a6a9eec0c0aba3a4cb22871e73372f749ba6ee3f2ef320159950099474b6c68ada183cb20c5a344d62809f38036"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hlint-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
