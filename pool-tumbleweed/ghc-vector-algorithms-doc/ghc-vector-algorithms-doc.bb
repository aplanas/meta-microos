SUMMARY = "Haskell vector-algorithms library documentation"
DESCRIPTION = "This package provides the Haskell vector-algorithms library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.9.0.1"

RPM_NAME = "ghc-vector-algorithms-doc-0.9.0.1-1.9.noarch.rpm"
RPM_HASH = "64f77c07adbeef08db1ae94f381813f1c41ec664ffdd90e42533e7794657003b0a61a23a5565c2579d3160f845c3b7aff86d199e2627b0084cadfa947983c5ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-vector-algorithms-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
