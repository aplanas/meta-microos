SUMMARY = "Haskell cryptonite-conduit library documentation"
DESCRIPTION = "This package provides the Haskell cryptonite-conduit library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "ghc-cryptonite-conduit-doc-0.2.2-9.3.noarch.rpm"
RPM_HASH = "27778e274802a7333803921a1533d772edc4e631598a23164b8ef5b3d1dd3ca007643c4188bf6a3b490cf34d4c2acf273f8b30657cfed172d28dcdcedf03a17b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cryptonite-conduit-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
