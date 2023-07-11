SUMMARY = "Haskell hslua-module-doclayout library documentation"
DESCRIPTION = "This package provides the Haskell hslua-module-doclayout library documentation."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ghc-hslua-module-doclayout-doc-1.1.0-1.3.noarch.rpm"
RPM_HASH = "15c293451607f7497998283e4da3e57d3f814a8f11ae6837271ec6f510389228b14a9dc221db3b738ae212208a0fc2ff4b88b7f0d32f37c9d8e0ede45f6f74dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-module-doclayout-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
