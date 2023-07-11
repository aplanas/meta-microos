SUMMARY = "Haskell QuickCheck library documentation"
DESCRIPTION = "This package provides the Haskell QuickCheck library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.14.3"

RPM_NAME = "ghc-QuickCheck-doc-2.14.3-1.3.noarch.rpm"
RPM_HASH = "822f8db37fe89d721985fcb114b8f4a0fbc11f12615038d4c2fd1847b06c001417ad05be9e2fd40493bef821411bd4f174fa04cb197aff13acecf76dcc67e420"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-QuickCheck-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
