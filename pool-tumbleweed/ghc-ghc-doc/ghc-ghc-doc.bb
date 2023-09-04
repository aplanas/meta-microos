SUMMARY = "Haskell ghc library documentation"
DESCRIPTION = "This package provides the Haskell ghc library documentation."
LICENSE = "BSD-3-Clause"

PV = "9.4.6"

RPM_NAME = "ghc-ghc-doc-9.4.6-1.1.noarch.rpm"
RPM_HASH = "d8a9c5a4ddcb22f58664739b96ccfd2e8afcaa6ebda0e8a227dcef9d16c01a76dd554d68fb2c8f3fc4770833ce68be036bdb95de37636378b6c8dc933f60d31c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghc-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
