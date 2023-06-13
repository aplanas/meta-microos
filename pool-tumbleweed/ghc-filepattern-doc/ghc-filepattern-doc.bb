SUMMARY = "Haskell filepattern library documentation"
DESCRIPTION = "This package provides the Haskell filepattern library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "ghc-filepattern-doc-0.1.3-2.4.noarch.rpm"
RPM_HASH = "1e43083a5c8f34f1a099cb4aed45329141d8dce89dfc22c7caed11cc5b2ab4166cc2a5e739789e9b19796e964edb91d26206520f7d065a272798744a89c33f5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-filepattern-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
