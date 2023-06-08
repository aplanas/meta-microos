SUMMARY = "Haskell microlens-th library documentation"
DESCRIPTION = "This package provides the Haskell microlens-th library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.3.12"

RPM_NAME = "ghc-microlens-th-doc-0.4.3.12-1.2.noarch.rpm"
RPM_HASH = "490fd36d9a451f567b9134f48051414e79c5dc387b00239b33349a2f849d49cde554e0560e74f884ec8defbe4c0077f5ec955856e218b143ff89ae3c5b82701b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-microlens-th-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
