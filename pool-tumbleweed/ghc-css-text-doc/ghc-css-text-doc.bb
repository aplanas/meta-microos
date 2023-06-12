SUMMARY = "Haskell css-text library documentation"
DESCRIPTION = "This package provides the Haskell css-text library documentation."
LICENSE = "MIT"

PV = "0.1.3.0"

RPM_NAME = "ghc-css-text-doc-0.1.3.0-4.3.noarch.rpm"
RPM_HASH = "1b8b8aced957fb8361fffc3951487c1eaabd67c8fb1f296e898c8d5b87f43d6b70d9300109f601f6d03672061ebf78eaae3f09bb7574dc15d8d774930f452931"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-css-text-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
