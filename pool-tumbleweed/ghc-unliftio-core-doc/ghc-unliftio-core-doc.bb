SUMMARY = "Haskell unliftio-core library documentation"
DESCRIPTION = "This package provides the Haskell unliftio-core library documentation."
LICENSE = "MIT"

PV = "0.2.1.0"

RPM_NAME = "ghc-unliftio-core-doc-0.2.1.0-1.6.noarch.rpm"
RPM_HASH = "3a3dbc2e805c25a5271376dda19eb6d0974f9a4d0a99a5ca392a105bfeb86e3053e754dc6fb9f852ae306465fb51313976cc9a1fb4d282b3bce8ed69e46d1d02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-unliftio-core-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
