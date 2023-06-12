SUMMARY = "Haskell xml-hamlet library documentation"
DESCRIPTION = "This package provides the Haskell xml-hamlet library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.2"

RPM_NAME = "ghc-xml-hamlet-doc-0.5.0.2-2.3.noarch.rpm"
RPM_HASH = "257160a0936cab0484ebdad0d41af716cf07834afd4ce35d27d3b75165dd5e7d9ae93dfe8497ec98460bfac83238e494d6c3599c60965fef8fcf8258ee6c7761"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-xml-hamlet-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
