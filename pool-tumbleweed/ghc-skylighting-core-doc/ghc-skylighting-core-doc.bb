SUMMARY = "Haskell skylighting-core library documentation"
DESCRIPTION = "This package provides the Haskell skylighting-core library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.13.4.1"

RPM_NAME = "ghc-skylighting-core-doc-0.13.4.1-1.5.noarch.rpm"
RPM_HASH = "a28ce802e006f4e9601716a48708a330a37445668cb819592797ed85f9e7dbd9f5fe832d8458749e3b565ae18d9d22316dfaf491e02627ba78be5fc9b9ebd5b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skylighting-core-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
