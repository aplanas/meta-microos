SUMMARY = "Haskell securemem library documentation"
DESCRIPTION = "This package provides the Haskell securemem library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.10"

RPM_NAME = "ghc-securemem-doc-0.1.10-4.4.noarch.rpm"
RPM_HASH = "2c60d74a26d3634a11786b6759602bab0ee37d25a3a210d38101f04ce8343c5d6ff1c66b258e3e5b28d0b4871b826fde4d99293048325ab39484976d7eb58fc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-securemem-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
