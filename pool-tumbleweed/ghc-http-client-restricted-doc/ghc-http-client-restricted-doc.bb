SUMMARY = "Haskell http-client-restricted library documentation"
DESCRIPTION = "This package provides the Haskell http-client-restricted library documentation."
LICENSE = "MIT"

PV = "0.0.5"

RPM_NAME = "ghc-http-client-restricted-doc-0.0.5-2.7.noarch.rpm"
RPM_HASH = "c491dd0090112e8f207868a092a85338182da2eaa3a08368dd34cf7a78a3ee931ab23963076d2960a084a965b21a6e8dbcaa740494399941968946fcb6656238"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-http-client-restricted-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
