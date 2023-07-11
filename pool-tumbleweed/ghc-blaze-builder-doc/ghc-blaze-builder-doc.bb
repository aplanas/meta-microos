SUMMARY = "Haskell blaze-builder library documentation"
DESCRIPTION = "This package provides the Haskell blaze-builder library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.2.2"

RPM_NAME = "ghc-blaze-builder-doc-0.4.2.2-3.6.noarch.rpm"
RPM_HASH = "160ab7ed00191e6e339f4617883434caa6f0079456a22a08c86112d33cd4deb9b05b5d3993855fae1bf1d31a86a47e190c9bc110beb8ba351679b868fe3697b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-blaze-builder-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
