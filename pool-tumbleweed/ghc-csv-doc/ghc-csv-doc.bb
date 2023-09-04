SUMMARY = "Haskell csv library documentation"
DESCRIPTION = "This package provides the Haskell csv library documentation."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "ghc-csv-doc-0.1.2-4.3.noarch.rpm"
RPM_HASH = "748f16442b7946a605294013dc4694c537fb6e1343d04ce32b5ad3450159747f0a1ef6a638f1cb030b9e51a393dbe9aadd98d3359000a37e109c239ab9784566"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-csv-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
