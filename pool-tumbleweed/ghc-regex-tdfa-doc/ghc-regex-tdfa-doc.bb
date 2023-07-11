SUMMARY = "Haskell regex-tdfa library documentation"
DESCRIPTION = "This package provides the Haskell regex-tdfa library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3.2.1"

RPM_NAME = "ghc-regex-tdfa-doc-1.3.2.1-1.3.noarch.rpm"
RPM_HASH = "9c171373a48a793664923e8f3374ad7d33ae388b38d1a52913f96e0e04148a965a6f18b24341e9cb7b797106857de921c825a90a5bd35a8acae003eafe110da1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-regex-tdfa-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
