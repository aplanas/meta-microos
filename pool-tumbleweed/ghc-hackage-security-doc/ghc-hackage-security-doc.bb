SUMMARY = "Haskell hackage-security library documentation"
DESCRIPTION = "This package provides the Haskell hackage-security library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.6.2.3"

RPM_NAME = "ghc-hackage-security-doc-0.6.2.3-3.3.noarch.rpm"
RPM_HASH = "c469aa33ca63d940a5f5c5c395d1ec21153714826947da33c4e500b7dad77dc456b7de65e37779ac8e053d897f6ac545ae3f7bd2fd3f4c6050f9f095d8ac913a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hackage-security-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
