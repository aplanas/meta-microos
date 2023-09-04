SUMMARY = "Haskell free library documentation"
DESCRIPTION = "This package provides the Haskell free library documentation."
LICENSE = "BSD-3-Clause"

PV = "5.1.10"

RPM_NAME = "ghc-free-doc-5.1.10-2.9.noarch.rpm"
RPM_HASH = "c9243d4eee0bac6e3abb77ee7a4ffaef904773ba7779a31c74a4e4aa5cdaa9115566eb52470820382983ab0dca567750dc3c20c9053da24d3756e203c3c89e50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-free-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
