SUMMARY = "Haskell SHA library documentation"
DESCRIPTION = "This package provides the Haskell SHA library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.6.4.4"

RPM_NAME = "ghc-SHA-doc-1.6.4.4-8.2.noarch.rpm"
RPM_HASH = "d035470df4e7142f5df0241d7584c176685c5b146f694442d40a18155a97b415ce53fbbd46cd8a0dc71b5c3ab500bfa920906aec1c346cb301b7397c2ccd611a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-SHA-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
