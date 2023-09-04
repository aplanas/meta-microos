SUMMARY = "Haskell spdx library documentation"
DESCRIPTION = "This package provides the Haskell spdx library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.3"

RPM_NAME = "ghc-spdx-doc-1.0.0.3-1.3.noarch.rpm"
RPM_HASH = "04ed62109e966602c71fd513edd6d6a1b18e833184b046fde5e9d4f7a6775c7774e847a4a47a69b37c623c61e1da653adf14d2180124f5f744c4c54da3e64aa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-spdx-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
