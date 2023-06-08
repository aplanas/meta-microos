SUMMARY = "Haskell containers library documentation"
DESCRIPTION = "This package provides the Haskell containers library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.6.7"

RPM_NAME = "ghc-containers-doc-0.6.7-1.1.noarch.rpm"
RPM_HASH = "380d3da32aaf9ce36003a72f834357d1b43a8c9c504e491de84fc40388983aa1e542e5f4262fb03e39a6443ebc40f2716850c8207b4c7703dfbae019f978ca8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-containers-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
