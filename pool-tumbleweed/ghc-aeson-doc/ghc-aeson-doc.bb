SUMMARY = "Haskell aeson library documentation"
DESCRIPTION = "This package provides the Haskell aeson library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.1.2.1"

RPM_NAME = "ghc-aeson-doc-2.1.2.1-3.1.noarch.rpm"
RPM_HASH = "4a447b42f52c27fc2728807d479d871b5b55f3f4c86e7a3b2a43e15c901e40139b28ff6b4888979ffcc90167971a0e98bd12f2979f377dcc9322bca8675f5a0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-aeson-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
