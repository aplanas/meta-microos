SUMMARY = "Haskell blaze-html library documentation"
DESCRIPTION = "This package provides the Haskell blaze-html library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.9.1.2"

RPM_NAME = "ghc-blaze-html-doc-0.9.1.2-10.1.noarch.rpm"
RPM_HASH = "352f4a383c418381081c14e665fe44d9485ca2c10ff09e2b46ad04fbccf01bea43622d1b977f17a0b2fdd40847d2d6c1fe85b9259a46324d8ed714c12a92be29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-blaze-html-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
