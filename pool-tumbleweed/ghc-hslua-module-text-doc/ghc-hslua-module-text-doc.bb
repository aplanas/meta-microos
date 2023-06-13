SUMMARY = "Haskell hslua-module-text library documentation"
DESCRIPTION = "This package provides the Haskell hslua-module-text library documentation."
LICENSE = "MIT"

PV = "1.1.0.1"

RPM_NAME = "ghc-hslua-module-text-doc-1.1.0.1-1.2.noarch.rpm"
RPM_HASH = "be8f943be09a56c3187abca759cf931499a2baf36ab3368c0159883d89310ee4a6f22fe07c940e09c8cb9a7dcfe7f6519843b6555bc56bda2863473d3319bfca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-module-text-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
