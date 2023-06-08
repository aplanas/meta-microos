SUMMARY = "Haskell securemem library documentation"
DESCRIPTION = "This package provides the Haskell securemem library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.10"

RPM_NAME = "ghc-securemem-doc-0.1.10-4.2.noarch.rpm"
RPM_HASH = "d4e0a288d8733b624a85012106306a506f6a716f49806e443917738f067572d52d61c21f59fdaab4083eeca2a54e26d22007416c245f4b8526daf444e14b3372"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-securemem-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
