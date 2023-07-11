SUMMARY = "Haskell http-types library documentation"
DESCRIPTION = "This package provides the Haskell http-types library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.12.3"

RPM_NAME = "ghc-http-types-doc-0.12.3-6.6.noarch.rpm"
RPM_HASH = "58e663f98f14b2f525f891eee6aa4308432b43e8c61a018e007cef3c78a8e0c878252e90d8702ed97401a100f3ee7dbadcb34a0bc83384c88277087a79eaf8fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-http-types-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
