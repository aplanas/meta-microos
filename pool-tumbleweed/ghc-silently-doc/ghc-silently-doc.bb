SUMMARY = "Haskell silently library documentation"
DESCRIPTION = "This package provides the Haskell silently library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.2.5.3"

RPM_NAME = "ghc-silently-doc-1.2.5.3-2.2.noarch.rpm"
RPM_HASH = "9b603e0a9b5dc8357dfb9b27084eb6c8469c654329b664d5749290ee866f7216ad8c0979735245b6aaae55289412f4b9095449e4b9ab153f08dabb34d679e5c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-silently-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
