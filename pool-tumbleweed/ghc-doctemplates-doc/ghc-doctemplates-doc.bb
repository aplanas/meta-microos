SUMMARY = "Haskell doctemplates library documentation"
DESCRIPTION = "This package provides the Haskell doctemplates library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.11"

RPM_NAME = "ghc-doctemplates-doc-0.11-1.3.noarch.rpm"
RPM_HASH = "76454439d49b962441b05f2e1b430587df4e707e4df28a2c2af281b757735ccff26c366d39e8dc530e9ce7b22c0e4ea3ef552e0276c07715770bb4a01be7c6f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-doctemplates-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
