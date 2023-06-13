SUMMARY = "Haskell xml-types library documentation"
DESCRIPTION = "This package provides the Haskell xml-types library documentation."
LICENSE = "MIT"

PV = "0.3.8"

RPM_NAME = "ghc-xml-types-doc-0.3.8-4.2.noarch.rpm"
RPM_HASH = "60b9ead3387481b08028fc4dcc56f14e31bd72b98fd4310cc7b7e087ac1c0d7b4f40751f8ec26e3dc1129e79dadbabb5e47b3ea37b183a6fa26268680da565a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-xml-types-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
