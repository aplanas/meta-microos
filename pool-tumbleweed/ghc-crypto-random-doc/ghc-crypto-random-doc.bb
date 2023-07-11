SUMMARY = "Haskell crypto-random library documentation"
DESCRIPTION = "This package provides the Haskell crypto-random library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.0.9"

RPM_NAME = "ghc-crypto-random-doc-0.0.9-5.6.noarch.rpm"
RPM_HASH = "b64596cdb23cec441bb190aa9fd0200c3a6e5fd624b7db9709db506753d71784d49dc7c99ab6e8cf07a69c44ee02002f2e7ec45bb04fd0e01fb89acfcd49b4ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-crypto-random-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
