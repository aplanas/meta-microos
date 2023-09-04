SUMMARY = "Haskell lua library documentation"
DESCRIPTION = "This package provides the Haskell lua library documentation."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "ghc-lua-doc-2.3.1-1.8.noarch.rpm"
RPM_HASH = "b6aaa0ce801c1a91ec8cad028f8d134dff5769515f07fe620915787716fb030db4b31eb54f3abf1be5e08ee0f4e3b6b9e202eebd0dd9220c61230b7c674f6137"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-lua-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
