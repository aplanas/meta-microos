SUMMARY = "Haskell pretty library documentation"
DESCRIPTION = "This package provides the Haskell pretty library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.1.3.6"

RPM_NAME = "ghc-pretty-doc-1.1.3.6-1.1.noarch.rpm"
RPM_HASH = "4100358c7fc19cf12f2a4e5d02e7e83fb8251ec78f59762ccd9065cbb5e57f7871f9af12be5be31957009dcb2892407314a2e7e6f4305421b72186f74e5c31b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pretty-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
