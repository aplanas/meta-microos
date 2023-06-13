SUMMARY = "Haskell gitrev library documentation"
DESCRIPTION = "This package provides the Haskell gitrev library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "ghc-gitrev-doc-1.3.1-9.2.noarch.rpm"
RPM_HASH = "93fb2330ecf32e9302d330ae61ebe1cb3578319111b68ff9f62b69a441686d479f174369ee950229ac61b8d56ac8fb208889e42354ac7bf92bebb60acd3c66a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-gitrev-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
