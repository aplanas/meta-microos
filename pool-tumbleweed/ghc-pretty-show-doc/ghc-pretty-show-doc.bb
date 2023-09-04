SUMMARY = "Haskell pretty-show library documentation"
DESCRIPTION = "This package provides the Haskell pretty-show library documentation."
LICENSE = "MIT"

PV = "1.10"

RPM_NAME = "ghc-pretty-show-doc-1.10-4.8.noarch.rpm"
RPM_HASH = "aaca618c3dc9daa866d0edec7e7ef3c847d1ff5c0ccaa14e15720c87069a17eb256c4cfb21bb7a49f4739eb8fde3bbeaa203d6fff4083e4bf79bdfeb94b131f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pretty-show-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
