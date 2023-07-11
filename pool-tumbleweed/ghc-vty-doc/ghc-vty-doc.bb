SUMMARY = "Haskell vty library documentation"
DESCRIPTION = "This package provides the Haskell vty library documentation."
LICENSE = "BSD-3-Clause"

PV = "5.38"

RPM_NAME = "ghc-vty-doc-5.38-2.8.noarch.rpm"
RPM_HASH = "06dffbdeb4ccff022b1b36ad1c83ad7780e1f0150d5bd49082374bb7b5beb19b9d2435ceec14d21a538a7008222aaae98bf778c27d9593698a02c50cf4bea520"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-vty-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
