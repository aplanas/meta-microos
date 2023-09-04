SUMMARY = "Haskell criterion-measurement library documentation"
DESCRIPTION = "This package provides the Haskell criterion-measurement library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.1.0"

RPM_NAME = "ghc-criterion-measurement-doc-0.2.1.0-1.7.noarch.rpm"
RPM_HASH = "48bcae0dd14d8b407f3176b98d3af4e56c2d827037ed36826671bcc8570481e91317ba771f2f7c682841d10a9f05aec674115dfac87d951758e7da5b938f4d10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-criterion-measurement-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
