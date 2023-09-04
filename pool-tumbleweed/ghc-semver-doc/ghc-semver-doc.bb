SUMMARY = "Haskell semver library documentation"
DESCRIPTION = "This package provides the Haskell semver library documentation."
LICENSE = "MPL-2.0"

PV = "0.4.0.1"

RPM_NAME = "ghc-semver-doc-0.4.0.1-1.9.noarch.rpm"
RPM_HASH = "2b10505b30279e124738594a6aa07dcd081cab67d679f663f71529f285aeb006743da61aa4d03e7fbffa365c0386b71e3d1c6693f23dfd99a4a79994a0a8ade7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-semver-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
