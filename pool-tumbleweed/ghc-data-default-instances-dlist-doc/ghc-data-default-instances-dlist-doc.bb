SUMMARY = "Haskell data-default-instances-dlist library documentation"
DESCRIPTION = "This package provides the Haskell data-default-instances-dlist library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.0.1"

RPM_NAME = "ghc-data-default-instances-dlist-doc-0.0.1-11.3.noarch.rpm"
RPM_HASH = "c1084ba5e6ab8ef64c7a8f831958c501e1bea858fa283e84a7694340a14d4b97fd636619c114d963c49259298de90ca684535ee0b1f5f6454b0ea4b8f3f01270"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-data-default-instances-dlist-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
