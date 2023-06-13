SUMMARY = "Haskell th-lift-instances library documentation"
DESCRIPTION = "This package provides the Haskell th-lift-instances library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.20"

RPM_NAME = "ghc-th-lift-instances-doc-0.1.20-2.2.noarch.rpm"
RPM_HASH = "70be1c813f2beb126e37874cc58b78e59d70536bb5bf649ce003da03362fc534513fccd5a79fd60098842147c04c19890f0f243165b5d6f9bc0309e2fcd26eb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-th-lift-instances-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
