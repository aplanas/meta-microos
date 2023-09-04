SUMMARY = "Haskell blaze-html library documentation"
DESCRIPTION = "This package provides the Haskell blaze-html library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.9.1.2"

RPM_NAME = "ghc-blaze-html-doc-0.9.1.2-9.3.noarch.rpm"
RPM_HASH = "bf1d3276fa08b38eb1f5adaa5de5295249d32e777ffd3efc38f655588791fa5f4283f8149f7e503d63483091a5d6a32f4fa811a8d193fa4fd89f1639110fc041"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-blaze-html-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
