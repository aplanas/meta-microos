SUMMARY = "Haskell vector-binary-instances library documentation"
DESCRIPTION = "This package provides the Haskell vector-binary-instances library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.5.2"

RPM_NAME = "ghc-vector-binary-instances-doc-0.2.5.2-5.2.noarch.rpm"
RPM_HASH = "103031dcac8a5d9fd7cbcec65262eb7291ae872429bc7bc4c06b05e46160a0fcd5bb6da6cdaf5c6d1e7cf303d6476aa4805d2d33dd51c0806204428d978df3ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-vector-binary-instances-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
