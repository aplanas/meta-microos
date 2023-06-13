SUMMARY = "Haskell data-fix library documentation"
DESCRIPTION = "This package provides the Haskell data-fix library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.2"

RPM_NAME = "ghc-data-fix-doc-0.3.2-4.2.noarch.rpm"
RPM_HASH = "89ad4c90f146eb90fa4925c57b850dac77374c3f7452199c22761388a9e7458c53cbfa30a8b82e478bbde0646b91b0fdf927ebfffa1a91159ac788c994924170"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-data-fix-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
