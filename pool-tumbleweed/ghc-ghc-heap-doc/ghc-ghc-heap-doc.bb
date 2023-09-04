SUMMARY = "Haskell ghc-heap library documentation"
DESCRIPTION = "This package provides the Haskell ghc-heap library documentation."
LICENSE = "BSD-3-Clause"

PV = "9.4.6"

RPM_NAME = "ghc-ghc-heap-doc-9.4.6-1.1.noarch.rpm"
RPM_HASH = "c31fd90f91b663f3b0c273da850c69082190b1e255c0dbd65904a68f4dead9fcefd177fef5227888dce779e15f3fa9fe2062210c9a4b3490c558b9e54e0a21b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghc-heap-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
