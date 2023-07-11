SUMMARY = "Haskell recv library documentation"
DESCRIPTION = "This package provides the Haskell recv library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "ghc-recv-doc-0.1.0-1.7.noarch.rpm"
RPM_HASH = "da7543c848841e95162261ad7bbee28a42d4c41ef75b25a3defeeb46dc7fa8f9163bc5319d5475faf30132869cae0c441197851c8650f8ea60a31b7bd02552eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-recv-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
