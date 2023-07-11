SUMMARY = "Haskell vector-algorithms library documentation"
DESCRIPTION = "This package provides the Haskell vector-algorithms library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.9.0.1"

RPM_NAME = "ghc-vector-algorithms-doc-0.9.0.1-1.6.noarch.rpm"
RPM_HASH = "277aab6bea55b7c6fdc5cad5fdbdda7be3b3181048d62b36c545299abc5b8ec6a369757423f09e19e117e2527ae247f12c2dba5ef7b387bfe5da38b5338b1687"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-vector-algorithms-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
