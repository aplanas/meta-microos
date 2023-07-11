SUMMARY = "Haskell blaze-markup library documentation"
DESCRIPTION = "This package provides the Haskell blaze-markup library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.8.2.8"

RPM_NAME = "ghc-blaze-markup-doc-0.8.2.8-5.6.noarch.rpm"
RPM_HASH = "6e4052095b348701d1400282496835dd9ac776a40fa29db76e3d795fcbc995449f455ba21e1518f6ffeaf14b66b3f61d5ecc365dc6a6931b2baa55545b69a41f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-blaze-markup-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
