SUMMARY = "Haskell cryptonite library documentation"
DESCRIPTION = "This package provides the Haskell cryptonite library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.30"

RPM_NAME = "ghc-cryptonite-doc-0.30-2.3.noarch.rpm"
RPM_HASH = "e155e9d3885d9813d198506291899cff70d63e4f5532262e62d2dcaed406aceb59fedc857971033b42d70987c8f88a4b8987534ddcbaf2d6681d2ecc4a1f6a88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cryptonite-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
