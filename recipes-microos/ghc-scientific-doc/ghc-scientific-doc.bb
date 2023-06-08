SUMMARY = "Haskell scientific library documentation"
DESCRIPTION = "This package provides the Haskell scientific library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.7.0"

RPM_NAME = "ghc-scientific-doc-0.3.7.0-5.3.noarch.rpm"
RPM_HASH = "42478a910244cd609346dd50171c0c803627daf88a54c2b9f3369dbdd08fdf028ff1a53556e1737cff2ae9a6e9d6a74c96b7d7a28af313dcffe92ab0550d0d96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-scientific-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
