SUMMARY = "Haskell simple-sendfile library documentation"
DESCRIPTION = "This package provides the Haskell simple-sendfile library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.32"

RPM_NAME = "ghc-simple-sendfile-doc-0.2.32-1.4.noarch.rpm"
RPM_HASH = "5a2d6e5087601dc2cee98af8c30eaf6de2153165ec23932e0b014bcea9c6a76d6a457bcebebda85a0a193655201ed12e98dfdc9debe4c7eeb7c190e2a2cd9118"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-simple-sendfile-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
