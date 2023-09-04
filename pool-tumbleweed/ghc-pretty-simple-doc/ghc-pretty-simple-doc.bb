SUMMARY = "Haskell pretty-simple library documentation"
DESCRIPTION = "This package provides the Haskell pretty-simple library documentation."
LICENSE = "BSD-3-Clause"

PV = "4.1.2.0"

RPM_NAME = "ghc-pretty-simple-doc-4.1.2.0-1.8.noarch.rpm"
RPM_HASH = "0356a25ac8af927fc4b76e0a566a48218d10873af0254b74c9cf67738d379b7e8b2c35b343cd9486171624b2973c5abd59c13f17941f95498511159bf6bf9a18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pretty-simple-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
