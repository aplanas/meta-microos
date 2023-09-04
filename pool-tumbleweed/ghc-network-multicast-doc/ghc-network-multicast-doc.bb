SUMMARY = "Haskell network-multicast library documentation"
DESCRIPTION = "This package provides the Haskell network-multicast library documentation."
LICENSE = "CC0-1.0"

PV = "0.3.2"

RPM_NAME = "ghc-network-multicast-doc-0.3.2-4.4.noarch.rpm"
RPM_HASH = "0390443183cb081e197ab395ff131f54ea086e5468b2d72ecd14f68d02424abf92cef27f24141cb9b3b8c867cb9fa3a7db4ad00a3ab2bd6d1ed6078507d285f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-network-multicast-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
