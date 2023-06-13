SUMMARY = "Haskell utility-ht library documentation"
DESCRIPTION = "This package provides the Haskell utility-ht library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.0.16"

RPM_NAME = "ghc-utility-ht-doc-0.0.16-2.3.noarch.rpm"
RPM_HASH = "2ded364450b3d21c7f1cb37e316a0256849ce93da76ab679516e99ae63e8743506f0f0b4ad506638a60785d5411e50b42cd49ed5d4e01c740ec5c93d90c25664"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-utility-ht-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
