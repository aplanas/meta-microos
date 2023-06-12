SUMMARY = "Haskell byteable library documentation"
DESCRIPTION = "This package provides the Haskell byteable library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-byteable-doc-0.1.1-12.2.noarch.rpm"
RPM_HASH = "133dfbfcd68a005b29fec32f1dc9aedb17217c7e15d70d47e58e094af06a0aa0795c038522f655c0b63121cb6b76777ee50b5cf2c0883f82567731627e058a5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-byteable-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
