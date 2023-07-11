SUMMARY = "Haskell time library documentation"
DESCRIPTION = "This package provides the Haskell time library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "ghc-time-doc-1.12.2-3.2.noarch.rpm"
RPM_HASH = "c3f534f5df75b958c07b593dde80d19d607a8da3be1f88deb84b8bf0d371f4febf16e1b93e58ee9478552daf15b74d8e2bd8654a95b61e2e9a74da6451fade88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-time-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
