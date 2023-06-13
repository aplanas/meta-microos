SUMMARY = "Haskell skylighting library documentation"
DESCRIPTION = "This package provides the Haskell skylighting library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.13.2.1"

RPM_NAME = "ghc-skylighting-doc-0.13.2.1-1.4.noarch.rpm"
RPM_HASH = "45d379c9b6dc118471d596e26c3a7a9be15d51ec47d8d7f58b8eb0098eec8e3c54204e30269b3be4b1b62f4e81233ebdf43502ceaa0154bae5a4e867a11d3d86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skylighting-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
