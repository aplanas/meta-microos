SUMMARY = "Haskell regex-tdfa library documentation"
DESCRIPTION = "This package provides the Haskell regex-tdfa library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3.2"

RPM_NAME = "ghc-regex-tdfa-doc-1.3.2-2.3.noarch.rpm"
RPM_HASH = "d3d92ee5ad1db968667a673245462a92f74407fedc742e4eda26c6318c0e3a7b3875d1a5ad2946d6d1e23f4bcea97190fea45f851ddd79b5049b8e96ad3c2615"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-regex-tdfa-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
