SUMMARY = "Haskell data-default-instances-dlist library documentation"
DESCRIPTION = "This package provides the Haskell data-default-instances-dlist library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.0.1"

RPM_NAME = "ghc-data-default-instances-dlist-doc-0.0.1-11.2.noarch.rpm"
RPM_HASH = "09a5bcb3acb191a3fc2afbe9e50abab37b242d207394c1fc9e93c73a95a1727f1c1cdc3b9541486a91ceedcd6445d5cee77f36acea2fbb3e8bed630997425f1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-data-default-instances-dlist-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
