SUMMARY = "Haskell network-info library documentation"
DESCRIPTION = "This package provides the Haskell network-info library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-network-info-doc-0.2.1-2.2.noarch.rpm"
RPM_HASH = "bbb6b4b6aad1a38d4153774a05bb556eb7e3ff2b542ed40e5c50e6de778d4bfebd2e2196687b9e1d43b6c93fff8d263bae2caea21e3d01b7a72585a9945a765b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-network-info-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
