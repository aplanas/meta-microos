SUMMARY = "Haskell witherable library documentation"
DESCRIPTION = "This package provides the Haskell witherable library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.2"

RPM_NAME = "ghc-witherable-doc-0.4.2-4.6.noarch.rpm"
RPM_HASH = "3a838efe71b1577e2d6d58e9a68440692b334bb7e6cb00bc7456b39394d8478b3238234508f483885931215d7bafb92e251dfef73c52f2c6ffc25249423186db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-witherable-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
