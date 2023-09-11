SUMMARY = "Haskell blaze-markup library documentation"
DESCRIPTION = "This package provides the Haskell blaze-markup library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.8.2.8"

RPM_NAME = "ghc-blaze-markup-doc-0.8.2.8-6.4.noarch.rpm"
RPM_HASH = "7f41e7131a03c9e882c3b3a0b4809447f1042085f4ded41560f8a2a56db9ff38ece943a956e4eb7d76d35df5878fe39d371f9ff60f479f6714a06ddd4fb5b3c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-blaze-markup-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
