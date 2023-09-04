SUMMARY = "Haskell hinotify library documentation"
DESCRIPTION = "This package provides the Haskell hinotify library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "ghc-hinotify-doc-0.4.1-3.4.noarch.rpm"
RPM_HASH = "7711037a9a065909585d30c698f6a3c6cd396c9f6e00fc6c961d9f008b086bf456379184579cd5c272cd2f707f20db02976a250db8c2a450606d403bcdfacd6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hinotify-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
