SUMMARY = "Haskell base-compat library documentation"
DESCRIPTION = "This package provides the Haskell base-compat library documentation."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "ghc-base-compat-doc-0.13.0-1.3.noarch.rpm"
RPM_HASH = "bdefe799d23f965453fd0c8c86c509689c88d7f631c9d91923242e457d8590e4da2b94e55f8971576e4f72b97aa55d1075728c096c75e6e1718a9c1375a503d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-base-compat-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
