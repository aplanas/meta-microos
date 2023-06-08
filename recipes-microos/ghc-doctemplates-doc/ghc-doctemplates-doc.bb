SUMMARY = "Haskell doctemplates library documentation"
DESCRIPTION = "This package provides the Haskell doctemplates library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.11"

RPM_NAME = "ghc-doctemplates-doc-0.11-1.2.noarch.rpm"
RPM_HASH = "b957894f9772516fc93c2ae017616a6859e378491c20fc3822fef9f04472696c07c4c5990f5705ae5440432f0c7b031e88214ee871674e823bf0579b85cfbcea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-doctemplates-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
