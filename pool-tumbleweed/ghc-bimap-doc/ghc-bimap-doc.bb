SUMMARY = "Haskell bimap library documentation"
DESCRIPTION = "This package provides the Haskell bimap library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "ghc-bimap-doc-0.5.0-2.3.noarch.rpm"
RPM_HASH = "0ed778f0b56b742c947d99dde478fa639265e1b3aa8a39748c94c75e3b81847b4dc354f29f4b96c5f27c1679c7b2579e81f85a6bbd482f21c08bc80c5c11c520"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-bimap-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
