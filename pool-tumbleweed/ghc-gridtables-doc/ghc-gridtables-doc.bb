SUMMARY = "Haskell gridtables library documentation"
DESCRIPTION = "This package provides the Haskell gridtables library documentation."
LICENSE = "MIT"

PV = "0.1.0.0"

RPM_NAME = "ghc-gridtables-doc-0.1.0.0-1.2.noarch.rpm"
RPM_HASH = "d276fce9965462d265f205c5b0284ce547cd6c3197bc9ab8e0ae5ccbcea69164b05f305ea499889cf4880f81bc97345b1f5826109e9c6fad16428e303a7452b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-gridtables-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
