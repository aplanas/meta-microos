SUMMARY = "Haskell aws library documentation"
DESCRIPTION = "This package provides the Haskell aws library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.23"

RPM_NAME = "ghc-aws-doc-0.23-1.4.noarch.rpm"
RPM_HASH = "11539475400af4322977b661f0dfbc07e2c2535056a1c09ebc46b874b1dd9d40e79633b59e0d997a8b8c5d8d37f06877506e947796d7daaf3b591f4ff4985c24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-aws-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
