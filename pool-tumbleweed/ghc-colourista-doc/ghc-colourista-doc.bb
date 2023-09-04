SUMMARY = "Haskell colourista library documentation"
DESCRIPTION = "This package provides the Haskell colourista library documentation."
LICENSE = "MPL-2.0"

PV = "0.1.0.2"

RPM_NAME = "ghc-colourista-doc-0.1.0.2-2.2.noarch.rpm"
RPM_HASH = "e29925831c00595209560f30256456f16fd13465c03a4861edfdb9dbb813cece475b857f2621857bf901725b4d19f1a7c26e5243edde59d49f97b55eeafbebaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-colourista-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
