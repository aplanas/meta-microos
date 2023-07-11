SUMMARY = "Haskell word8 library documentation"
DESCRIPTION = "This package provides the Haskell word8 library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "ghc-word8-doc-0.1.3-5.6.noarch.rpm"
RPM_HASH = "3bab1073a225a8d99aa2a37c921383f7c58f1e983d32b825a9f5789aa449c302ffe86ddb4eec5e681f0a44232274127346999a9ac7a7b48693ea0cc2983d972c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-word8-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
