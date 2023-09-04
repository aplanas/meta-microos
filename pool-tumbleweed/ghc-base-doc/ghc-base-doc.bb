SUMMARY = "Haskell base library documentation"
DESCRIPTION = "This package provides the Haskell base library documentation."
LICENSE = "BSD-3-Clause"

PV = "4.17.2.0"

RPM_NAME = "ghc-base-doc-4.17.2.0-1.1.noarch.rpm"
RPM_HASH = "47d40f6b3500ce0a550ec773252eababf6c1afa21551d8bdd0e6f6a93eb8399f5eefea0e6f58990f21f733301e5440b813eea269a61c56333078f152df1cd5cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-base-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
