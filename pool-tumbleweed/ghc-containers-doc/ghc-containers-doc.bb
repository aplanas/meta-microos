SUMMARY = "Haskell containers library documentation"
DESCRIPTION = "This package provides the Haskell containers library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.6.7"

RPM_NAME = "ghc-containers-doc-0.6.7-1.1.noarch.rpm"
RPM_HASH = "e2fb5b35e06db09665fd7efc21714b214abbf4c4ce3555e75f82861c3ed3cbc51e702898186d221f4ab3399992ba8f50f87fcf48382c242d624a40d32eb6415d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-containers-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
