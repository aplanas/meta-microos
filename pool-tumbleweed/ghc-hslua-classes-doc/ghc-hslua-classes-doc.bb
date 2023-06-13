SUMMARY = "Haskell hslua-classes library documentation"
DESCRIPTION = "This package provides the Haskell hslua-classes library documentation."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-classes-doc-2.3.0-1.3.noarch.rpm"
RPM_HASH = "4e4ac8f75de661771422168296e4c6be2b185b31fb97a2edcefba52446650bf606b9d4d26adf4926a92363dcd43ded36e12963142c8b12a036ae629202e779e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-classes-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
