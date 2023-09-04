SUMMARY = "Haskell indexed-traversable-instances library documentation"
DESCRIPTION = "This package provides the Haskell indexed-traversable-instances library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.1.1.2"

RPM_NAME = "ghc-indexed-traversable-instances-doc-0.1.1.2-1.6.noarch.rpm"
RPM_HASH = "dff50680e1229fac072a49a400a8e6f136e7934e3d51ebf2dd55c9a22c67e54606a1aad53f7ef36e379473bba5224d69ce87647e1f6a82c21b736d7fb62e7e8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-indexed-traversable-instances-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
