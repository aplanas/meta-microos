SUMMARY = "Haskell semialign library documentation"
DESCRIPTION = "This package provides the Haskell semialign library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.2.0.1"

RPM_NAME = "ghc-semialign-doc-1.2.0.1-5.3.noarch.rpm"
RPM_HASH = "c6b62a276c8826db07111b6cb805d70009313365fd2970dad59e95f7cc5965f3d4aab8779f63ea278fd999afd5744873dec92ed127f3ccdf48788a58c065d25d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-semialign-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
