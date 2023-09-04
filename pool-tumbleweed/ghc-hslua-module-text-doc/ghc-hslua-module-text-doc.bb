SUMMARY = "Haskell hslua-module-text library documentation"
DESCRIPTION = "This package provides the Haskell hslua-module-text library documentation."
LICENSE = "MIT"

PV = "1.1.0.1"

RPM_NAME = "ghc-hslua-module-text-doc-1.1.0.1-1.3.noarch.rpm"
RPM_HASH = "0f146938259f4689948e8267cbaa17fb9abd0eb573c76b6f27c8ed4c0c1935059cc4d8ce6ae736c908b12a282d5727c0671f67a25a271fb46adf9e61749d6458"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-module-text-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
