SUMMARY = "Haskell network-info library documentation"
DESCRIPTION = "This package provides the Haskell network-info library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-network-info-doc-0.2.1-2.4.noarch.rpm"
RPM_HASH = "2d60d74d02bebeb23d39101b5046af0df9130c89b5f4ba137e18cd390955b9e0c7a74e1a53f5fd24e339ebda1df18e8515d35619fa0b1e6bbca629d39cd7db81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-network-info-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
