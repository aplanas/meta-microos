SUMMARY = "Haskell hadolint library documentation"
DESCRIPTION = "This package provides the Haskell hadolint library documentation."
LICENSE = "GPL-3.0-or-later"

PV = "2.12.0"

RPM_NAME = "ghc-hadolint-doc-2.12.0-1.9.noarch.rpm"
RPM_HASH = "c99dfecc17121ffb1c88efba9430fe084bccc6f81013286650169b1cfa710749261f36d47163dc3ad9a47984fa2978add7020ef2b9ee4f239824096dbf910514"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hadolint-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
