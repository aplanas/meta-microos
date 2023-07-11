SUMMARY = "Haskell hashable library documentation"
DESCRIPTION = "This package provides the Haskell hashable library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.4.2.0"

RPM_NAME = "ghc-hashable-doc-1.4.2.0-1.5.noarch.rpm"
RPM_HASH = "9c73bd014c85eafcf26a4c618b3a88452d30595d3e592d823d33b2e676f2978cb5c7650247c5ba10cc7239e4b9d55b4158088b983cc55e1b90247efd5ce7f590"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hashable-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
