SUMMARY = "Haskell x509-validation library documentation"
DESCRIPTION = "This package provides the Haskell x509-validation library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.6.12"

RPM_NAME = "ghc-x509-validation-doc-1.6.12-2.6.noarch.rpm"
RPM_HASH = "13b735ca6452105641ccccd9035207db1db8873b32415ace5288c8055a31d42543a69992f9c623c4b1edbb37db8e9f65eca8bb52549b4916db1d8fba3d3119b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-x509-validation-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
