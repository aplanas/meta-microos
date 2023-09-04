SUMMARY = "Haskell base16-bytestring library documentation"
DESCRIPTION = "This package provides the Haskell base16-bytestring library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.2.0"

RPM_NAME = "ghc-base16-bytestring-doc-1.0.2.0-2.3.noarch.rpm"
RPM_HASH = "39dac57bcba65047dc1e6a21994ebbc88430775dfcc5b810a13cee8804dd6572e146a6db2bf71c589175fe7db6f77dd16fd574e9666f544461f53176e582e1d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-base16-bytestring-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
