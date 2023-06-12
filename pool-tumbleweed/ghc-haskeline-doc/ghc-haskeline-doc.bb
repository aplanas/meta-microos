SUMMARY = "Haskell haskeline library documentation"
DESCRIPTION = "This package provides the Haskell haskeline library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.8.2"

RPM_NAME = "ghc-haskeline-doc-0.8.2-3.1.noarch.rpm"
RPM_HASH = "77d72705825c39cf737b74caea14ebcfbae643e92fca4f5bef37c61fbb18b706655280dd050fff10b8f2aca254b44dacd4d5375530e74911f98cad3cd36f2694"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-haskeline-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
