SUMMARY = "Haskell vector-th-unbox library documentation"
DESCRIPTION = "This package provides the Haskell vector-th-unbox library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "ghc-vector-th-unbox-doc-0.2.2-4.2.noarch.rpm"
RPM_HASH = "143958c9d8b17e05fcb524cbbb8bccccfc07313dcc3593cbcc6d03fe9ba520e4f7a2f6ba78df796a8c40f6a9fc423a173507c5af455951cf4a15ad0badcd2e3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-vector-th-unbox-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
