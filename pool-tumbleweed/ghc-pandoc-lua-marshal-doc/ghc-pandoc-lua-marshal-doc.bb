SUMMARY = "Haskell pandoc-lua-marshal library documentation"
DESCRIPTION = "This package provides the Haskell pandoc-lua-marshal library documentation."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "ghc-pandoc-lua-marshal-doc-0.2.2-1.7.noarch.rpm"
RPM_HASH = "d4a22113e1af2a6ce462a8d42baadcd5cfcc5351ccab66f2861525e5120627021500cd0d7d0b86497ad0e48862f00bddb093a5f98e047d007a5deeedee1c4105"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pandoc-lua-marshal-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
