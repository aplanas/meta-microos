SUMMARY = "Haskell hjsmin library documentation"
DESCRIPTION = "This package provides the Haskell hjsmin library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-hjsmin-doc-0.2.1-1.2.noarch.rpm"
RPM_HASH = "b3b3f4a540e164259f59a1a45df2e017ffa83e0b9efc361cd2213f1e50456751f23b188f6d5dfad60353bfe15708801ea6f92a7ce5a30547c837751adcaa148d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hjsmin-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
