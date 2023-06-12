SUMMARY = "Haskell pem library documentation"
DESCRIPTION = "This package provides the Haskell pem library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.4"

RPM_NAME = "ghc-pem-doc-0.2.4-8.3.noarch.rpm"
RPM_HASH = "b893f98c5c1fea42b4c3619fc1a69624465c060437e245ea7d3f6a1dd5bb0672dd93aa00e1a0397c7bcd70d231de10d04332712ee0fc144f0316dc274f1b4b04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pem-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
