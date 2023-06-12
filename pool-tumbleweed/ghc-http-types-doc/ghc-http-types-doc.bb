SUMMARY = "Haskell http-types library documentation"
DESCRIPTION = "This package provides the Haskell http-types library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.12.3"

RPM_NAME = "ghc-http-types-doc-0.12.3-6.3.noarch.rpm"
RPM_HASH = "1434b686c14b88abd0b8c63220adeb9ef0823733da17fa5546dda384482c7cf24001e8b778ba7d0bb94ff83651bfc2ca7ee01bd58339f76ba5f12864fc0aa843"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-http-types-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
