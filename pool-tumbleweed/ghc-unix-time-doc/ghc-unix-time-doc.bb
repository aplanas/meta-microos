SUMMARY = "Haskell unix-time library documentation"
DESCRIPTION = "This package provides the Haskell unix-time library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.9"

RPM_NAME = "ghc-unix-time-doc-0.4.9-1.3.noarch.rpm"
RPM_HASH = "a8febf21c50faf37c647c00a8e92c00792ccd39d88774b66b93f2012690afbd8203d4f5507fc7ccb53626275753911a175bdac497afd95d8034d22fe8296fbfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-unix-time-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
