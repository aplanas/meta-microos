SUMMARY = "Haskell pem library documentation"
DESCRIPTION = "This package provides the Haskell pem library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.4"

RPM_NAME = "ghc-pem-doc-0.2.4-8.8.noarch.rpm"
RPM_HASH = "c32dd9021f96ef0896ef72a7a499a1c790279a6d5e5952904a7d3c411012c128d088549c2245b1724f494d43ea8c1c9dd321ca7dfb47ce4b5fd4f8529e4e9676"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pem-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
