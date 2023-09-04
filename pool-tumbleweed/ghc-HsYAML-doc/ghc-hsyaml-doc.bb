SUMMARY = "Haskell HsYAML library documentation"
DESCRIPTION = "This package provides the Haskell HsYAML library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.1.1"

RPM_NAME = "ghc-HsYAML-doc-0.2.1.1-5.3.noarch.rpm"
RPM_HASH = "d1f146c9895705147b9c84412d77de3ec528410ce0f1f9b6a6a02b33cbf00414b32d91feff1077802fa040fbf32a5ab892b85bce1da8c9038d4e963372fe556a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-HsYAML-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
