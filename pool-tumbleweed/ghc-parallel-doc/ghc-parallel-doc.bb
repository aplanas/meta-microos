SUMMARY = "Haskell parallel library documentation"
DESCRIPTION = "This package provides the Haskell parallel library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.2.2.0"

RPM_NAME = "ghc-parallel-doc-3.2.2.0-12.6.noarch.rpm"
RPM_HASH = "eaeff71bbf7c0ef27f54acfca6be563a67b7e172e1fe880f426593a7d98b7b1a579759b758e2136667363e2b83593f82aaa430f853da2cee4c5315aa951ab534"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-parallel-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
