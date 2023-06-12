SUMMARY = "Haskell mwc-random library documentation"
DESCRIPTION = "This package provides the Haskell mwc-random library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.15.0.2"

RPM_NAME = "ghc-mwc-random-doc-0.15.0.2-3.3.noarch.rpm"
RPM_HASH = "6e45f019f967f1fbc4cfbb7ca6897d4dff6b56bc727b4e15f98a44ae9e7d01be654dbd206bdc5bf4598442ce60a50b8732dbb5d0f07daf6e1120e0dc6ecd24f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-mwc-random-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
