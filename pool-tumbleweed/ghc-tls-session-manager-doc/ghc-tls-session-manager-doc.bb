SUMMARY = "Haskell tls-session-manager library documentation"
DESCRIPTION = "This package provides the Haskell tls-session-manager library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.0.4"

RPM_NAME = "ghc-tls-session-manager-doc-0.0.4-4.3.noarch.rpm"
RPM_HASH = "083c72b94d346e79698900e2c14c0b01e08500a6f0d2b376fcf5eb8da6c743557638c2834a1de9ac54d067c1a978479829b4978d9632df20962e93918cca1155"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-tls-session-manager-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
