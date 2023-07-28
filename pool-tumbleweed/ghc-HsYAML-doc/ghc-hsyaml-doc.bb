SUMMARY = "Haskell HsYAML library documentation"
DESCRIPTION = "This package provides the Haskell HsYAML library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.1.1"

RPM_NAME = "ghc-HsYAML-doc-0.2.1.1-4.1.noarch.rpm"
RPM_HASH = "0283f4cb06650c98f2cb9493758c99a8d1893237424e722050c4571f7f645e66863c65bee1774dd7d090eff6ccb54738509c4232c4848b5ba268498d512cb882"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-HsYAML-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
