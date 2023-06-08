SUMMARY = "Haskell filepath library documentation"
DESCRIPTION = "This package provides the Haskell filepath library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.4.2.2"

RPM_NAME = "ghc-filepath-doc-1.4.2.2-1.1.noarch.rpm"
RPM_HASH = "550947c0ef6314c44f2851dde402bb3f0991d1b50566dc27b2973f4c801c6af67ccbaf8867281b61a679867f2ce7fe4cb6420a1dde3c5730b74c8b63a36d6b36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-filepath-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
