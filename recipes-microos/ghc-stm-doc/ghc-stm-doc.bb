SUMMARY = "Haskell stm library documentation"
DESCRIPTION = "This package provides the Haskell stm library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.5.1.0"

RPM_NAME = "ghc-stm-doc-2.5.1.0-1.1.noarch.rpm"
RPM_HASH = "926e0d23cc906010172b962ea6807ec688f419e942cf662dad8fb98f7ce8abd4467ac3dd1f7b8d65874c1b4a6ccfd0a611a46b1ff7731bb627d0ea962fb36f57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-stm-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
