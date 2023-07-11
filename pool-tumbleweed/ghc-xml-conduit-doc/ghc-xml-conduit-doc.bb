SUMMARY = "Haskell xml-conduit library documentation"
DESCRIPTION = "This package provides the Haskell xml-conduit library documentation."
LICENSE = "MIT"

PV = "1.9.1.3"

RPM_NAME = "ghc-xml-conduit-doc-1.9.1.3-1.2.noarch.rpm"
RPM_HASH = "032a7df4191da3e40dabe985a242d5161fe823c905fdecf7908ae3f96d008b9568d85455d936380586e93cae16d4c40d53fe85343dc0c163f6079cf9f092dfa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-xml-conduit-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
