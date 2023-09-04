SUMMARY = "Haskell semigroupoids library documentation"
DESCRIPTION = "This package provides the Haskell semigroupoids library documentation."
LICENSE = "BSD-2-Clause"

PV = "5.3.7"

RPM_NAME = "ghc-semigroupoids-doc-5.3.7-2.10.noarch.rpm"
RPM_HASH = "b2771b81c5daf16e70a1e3b9ea062acf85e42fe37dd53a6aba75db0813cd3286d2dea065aec887635c26f112db9c4006b258e422fe28f773fc72bf1eea42541c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-semigroupoids-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
