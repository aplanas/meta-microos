SUMMARY = "Haskell silently library documentation"
DESCRIPTION = "This package provides the Haskell silently library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.2.5.3"

RPM_NAME = "ghc-silently-doc-1.2.5.3-2.3.noarch.rpm"
RPM_HASH = "861083b96bf910ae5d63f6769f667933aff8b89f264f99e40f7d316bcd3d0b09bee4c93f8c394cfabf2d69bd3612036cf280b2b918e731efa5f9088d84d03190"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-silently-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
