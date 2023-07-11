SUMMARY = "Haskell xmonad-contrib library documentation"
DESCRIPTION = "This package provides the Haskell xmonad-contrib library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.17.1"

RPM_NAME = "ghc-xmonad-contrib-doc-0.17.1-3.7.noarch.rpm"
RPM_HASH = "a67cb7a0b113b400536377205fd6f195bc09ef7b97dd3e08c37a1bdb66d0d39d98646de710691b0b506c2b93dafabc2bea4a9ac0dcad637bd5cd30722eb6287d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-xmonad-contrib-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
