SUMMARY = "Haskell hslua-module-zip library documentation"
DESCRIPTION = "This package provides the Haskell hslua-module-zip library documentation."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ghc-hslua-module-zip-doc-1.1.0-1.2.noarch.rpm"
RPM_HASH = "abccb9d23f7cd3d5b901dfe6fd668031661178c4401576a67179b13f6e27e2b6da12a13dd8ea6e42d280841eb7f706acabf6e4419ed509d78518d0c2f007f105"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-module-zip-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
