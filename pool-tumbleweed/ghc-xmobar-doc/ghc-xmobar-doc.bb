SUMMARY = "Haskell xmobar library documentation"
DESCRIPTION = "This package provides the Haskell xmobar library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.46"

RPM_NAME = "ghc-xmobar-doc-0.46-2.6.noarch.rpm"
RPM_HASH = "bdafe35ddbcc25604d0bf3760ae496b0f82089cafcaa12ba2ca330e7f7f2afe8ca2f2674d75265f044c2292ef7a2d59f36c25caffa54fd229729c3786bd54b3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-xmobar-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
