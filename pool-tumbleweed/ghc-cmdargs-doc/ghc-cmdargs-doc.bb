SUMMARY = "Haskell cmdargs library documentation"
DESCRIPTION = "This package provides the Haskell cmdargs library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.10.22"

RPM_NAME = "ghc-cmdargs-doc-0.10.22-1.6.noarch.rpm"
RPM_HASH = "61e1a90930be248d94dc1c0231522c9857d19d8828a48c39091bf765415fb081460886a2cfb5d44590e965c10db9127667bd2354748f97b5211e8bc9d42b7810"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cmdargs-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
