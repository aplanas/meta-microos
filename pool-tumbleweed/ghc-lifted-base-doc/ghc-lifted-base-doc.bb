SUMMARY = "Haskell lifted-base library documentation"
DESCRIPTION = "This package provides the Haskell lifted-base library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.3.12"

RPM_NAME = "ghc-lifted-base-doc-0.2.3.12-8.6.noarch.rpm"
RPM_HASH = "d6877c51374479fc04769f585f993dbf1c605de1f4c55b0e173918e2d1da939f8471fa58cead57434546da6088ea704221210e059afc228b7c5648561eb6a726"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-lifted-base-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
