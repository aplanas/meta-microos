SUMMARY = "Haskell path-pieces library documentation"
DESCRIPTION = "This package provides the Haskell path-pieces library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-path-pieces-doc-0.2.1-12.2.noarch.rpm"
RPM_HASH = "e802c6c613ca161b4399f3acf7da87aaacf0ae4b09a08281dbd95f9a5f1ed3b8fe51162149906b64a82c89310871b62463a16fbd02dc2ea24608ffa5e4d78287"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-path-pieces-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
