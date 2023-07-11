SUMMARY = "Haskell indexed-profunctors library documentation"
DESCRIPTION = "This package provides the Haskell indexed-profunctors library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.1"

RPM_NAME = "ghc-indexed-profunctors-doc-0.1.1.1-1.1.noarch.rpm"
RPM_HASH = "ee4df8545b2e614c46bb2d7f9fd0b0b858c22293fe495327bcc81d12268d18f9c1cc17f820eb7cf086f352320624f5defbeab6a405c0fc3e5f739151668f4917"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-indexed-profunctors-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
