SUMMARY = "Haskell process library documentation"
DESCRIPTION = "This package provides the Haskell process library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.6.16.0"

RPM_NAME = "ghc-process-doc-1.6.16.0-3.2.noarch.rpm"
RPM_HASH = "1d658103848ff07ddf80baeb8fb6cd5ef561949f9c71b1e55400419e9dda6e2a67da7dfbe2f27b60950ecd0d69c2e9ee720cc7b8398c292ebca0a3e48d12d370"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-process-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
