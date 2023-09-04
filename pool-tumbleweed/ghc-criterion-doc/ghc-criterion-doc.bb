SUMMARY = "Haskell criterion library documentation"
DESCRIPTION = "This package provides the Haskell criterion library documentation."
LICENSE = "BSD-2-Clause"

PV = "1.6.3.0"

RPM_NAME = "ghc-criterion-doc-1.6.3.0-1.2.noarch.rpm"
RPM_HASH = "9a6aaa9f2af0f5374d8ce0acf8ce70f1acabf59b0823528acfb680b68841917ef0150c90d79e6272ff06113291fcd8ca6de63d144434a7b72dd2bfb999d770a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-criterion-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
