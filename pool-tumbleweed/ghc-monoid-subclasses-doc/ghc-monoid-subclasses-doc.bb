SUMMARY = "Haskell monoid-subclasses library documentation"
DESCRIPTION = "This package provides the Haskell monoid-subclasses library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.2.4"

RPM_NAME = "ghc-monoid-subclasses-doc-1.2.4-1.1.noarch.rpm"
RPM_HASH = "49747ef4faa78a57dd8734d0d59fdea3d8eccc12ecd3b7718762e9f022c8a114df8fb37185ee1007452906b7ae97e7f7edbf3ecb67edb86dec9a1a75ce41359d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-monoid-subclasses-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
