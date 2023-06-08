SUMMARY = "Haskell HsYAML library documentation"
DESCRIPTION = "This package provides the Haskell HsYAML library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.1.1"

RPM_NAME = "ghc-HsYAML-doc-0.2.1.1-3.3.noarch.rpm"
RPM_HASH = "0becafa7350730d3891011581f2b9c9adc6717107c41ab78c6034690e9a3bf1c556b4ecbf4680127008145cb14a77363bb60a5e53a6382dad119476038fb0117"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-HsYAML-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
