SUMMARY = "Haskell network-multicast library documentation"
DESCRIPTION = "This package provides the Haskell network-multicast library documentation."
LICENSE = "CC0-1.0"

PV = "0.3.2"

RPM_NAME = "ghc-network-multicast-doc-0.3.2-4.2.noarch.rpm"
RPM_HASH = "8b1dd0740b663636c2f04ac139f36ffc31516fa17e81fd0b0c4e0141ca2d44dc07d24e311dab72afd691c7d6daa16b50c1876e988956c6d0974dae08c48b37cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-network-multicast-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
