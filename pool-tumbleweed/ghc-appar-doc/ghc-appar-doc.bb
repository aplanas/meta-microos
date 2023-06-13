SUMMARY = "Haskell appar library documentation"
DESCRIPTION = "This package provides the Haskell appar library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.8"

RPM_NAME = "ghc-appar-doc-0.1.8-4.2.noarch.rpm"
RPM_HASH = "cf9a8a77a5c2576e4fa32a36ce1904b1807cf8318c3a1078ddcc157ae87d664fd8fc52a90dcc178ce3769f32fa563aa3fa37eb302ac799c0fae7e0cd0dd730c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-appar-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
