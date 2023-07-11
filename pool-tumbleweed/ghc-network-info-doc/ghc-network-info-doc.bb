SUMMARY = "Haskell network-info library documentation"
DESCRIPTION = "This package provides the Haskell network-info library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-network-info-doc-0.2.1-2.3.noarch.rpm"
RPM_HASH = "969f5dfa8746d2ddfadd87f9887439755fb950efd4badb2898a47a2786903f6380b9e09ec1559f33f6314d88224a55e390ff1c5bd88787dc1f26cb9d8a8690e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-network-info-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
