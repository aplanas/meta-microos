SUMMARY = "Haskell hslua-marshalling library documentation"
DESCRIPTION = "This package provides the Haskell hslua-marshalling library documentation."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-marshalling-doc-2.3.0-1.3.noarch.rpm"
RPM_HASH = "fecb34598f00f49876c8e704b0da8de00abe90c1c59bc0855301b97862b023f8c95e130d4a819ccddbb1b0b1063e9a588bce8e0ca69880b1731dc91013a4ffc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-marshalling-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
