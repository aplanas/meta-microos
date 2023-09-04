SUMMARY = "Haskell StateVar library documentation"
DESCRIPTION = "This package provides the Haskell StateVar library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.2.2"

RPM_NAME = "ghc-StateVar-doc-1.2.2-2.3.noarch.rpm"
RPM_HASH = "72109a2a162017ce6cc94097ecd7b6afa7444254c63f524598b1898f07cfd317036dcb2eb17cbf9b99c959f5e461dd5fc880c351aaf777707741e4f74fe286d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-StateVar-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
