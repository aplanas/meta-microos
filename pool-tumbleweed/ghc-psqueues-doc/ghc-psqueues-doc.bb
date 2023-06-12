SUMMARY = "Haskell psqueues library documentation"
DESCRIPTION = "This package provides the Haskell psqueues library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.7.3"

RPM_NAME = "ghc-psqueues-doc-0.2.7.3-2.3.noarch.rpm"
RPM_HASH = "614626a7a4a5ce23f93db8ba3fd68c59748d3e0cf189108f25e4244b3dc3cc09e36f6f4f78a82ed49c2ed75feb58e9b72a0fb62579596fa939b6d4804e51d773"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-psqueues-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
