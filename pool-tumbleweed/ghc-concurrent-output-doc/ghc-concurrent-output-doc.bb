SUMMARY = "Haskell concurrent-output library documentation"
DESCRIPTION = "This package provides the Haskell concurrent-output library documentation."
LICENSE = "BSD-2-Clause"

PV = "1.10.18"

RPM_NAME = "ghc-concurrent-output-doc-1.10.18-1.6.noarch.rpm"
RPM_HASH = "a7bb899e509ea98b208f2e807cb2c1572ff83eed071bf1370e32c11fc93a1ef2b3a5816e44938fabf7b35afd15bfe08972961b728f5f636df165ad6ddd014d0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-concurrent-output-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
