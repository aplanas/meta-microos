SUMMARY = "Haskell math-functions library documentation"
DESCRIPTION = "This package provides the Haskell math-functions library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.3.4.2"

RPM_NAME = "ghc-math-functions-doc-0.3.4.2-2.3.noarch.rpm"
RPM_HASH = "15a2d9ebc597dbb2c7e1e0b366e119858b929ec43c912c8c126f6b286c35f3911e52b787bf443d0f1d217108c833fbd2567ac9842483bc3758c402cb7d0b7681"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-math-functions-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
